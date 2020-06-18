package com.muyi.bigMonster.service;

import com.muyi.bigMonster.mapper.daily1.ComplexMetricsProjectInfoMapper;
import com.muyi.bigMonster.mapper.daily1.DiffCoverageReportMapper;
import com.muyi.bigMonster.model.daily1.ComplexMetricsProjectInfo;
import com.muyi.bigMonster.model.daily1.DiffCoverageReport;
import com.muyi.bigMonster.model.daily1.DiffCoverageReportExample;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.RowBounds;
import org.apache.maven.shared.invoker.*;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.ListBranchCommand;
import org.eclipse.jgit.lib.Ref;
import org.eclipse.jgit.transport.CredentialsProvider;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.File;
import java.io.FileInputStream;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 基础工程调试使用
 * test
 */
@Slf4j
@Service
public class ProjectsService {

    private static final String USERNAME = "qa-jenkins"; //qa-jenkins

    private static final String PASSWORD = "*6OGZD9hY5Ylkk$d!Mjv"; //*6OGZD9hY5Ylkk$d!Mjv

    private static final CredentialsProvider CP = new UsernamePasswordCredentialsProvider(USERNAME, PASSWORD);

    @Resource
    private ComplexMetricsProjectInfoMapper projectInfoMapper;


    @Resource
    private DiffCoverageReportMapper diffCoverageReportMapper;

    /**
     * 根据参数-构建查询对象
     *
     * @param projectName
     * @param baseBranch
     * @param diffBranch
     * @return
     */
    private DiffCoverageReportExample getAllByParamsExample(String projectName, String baseBranch, String diffBranch) {
        DiffCoverageReportExample example = new DiffCoverageReportExample();
        example.setOrderByClause("id desc");
        DiffCoverageReportExample.Criteria criteria = example.createCriteria();

        if (!projectName.isEmpty()) {
            criteria.andProjectnameEqualTo(projectName);
        }

        if (!baseBranch.isEmpty()) {
            criteria.andBasebranchEqualTo(baseBranch);
        }

        if (!diffBranch.isEmpty()) {
            criteria.andDiffbranchEqualTo(diffBranch);
        }
        return example;
    }

    /**
     * 根据参数-获取个数
     *
     * @return
     */
    public long totalCoverageReport(String projectName, String baseBranch, String diffBranch) {
        DiffCoverageReportExample example = getAllByParamsExample(projectName, baseBranch, diffBranch);
        return diffCoverageReportMapper.countByExample(example);
    }

    /**
     * 根据参数-获取覆盖率文件数据
     *
     * @param currentPage
     * @param pageSize
     * @return
     */
    public List<DiffCoverageReport> getDiffRecordByParams(String projectName, String baseBranch, String diffBranch, int currentPage, int pageSize) {
        DiffCoverageReportExample example = getAllByParamsExample(projectName, baseBranch, diffBranch);
        RowBounds rowBounds = new RowBounds((currentPage - 1) * pageSize, pageSize);
        return diffCoverageReportMapper.selectByExampleWithRowbounds(example, rowBounds);
    }

    /**
     * 获取所有已经添加的项目
     *
     * @return
     */
    public List<ComplexMetricsProjectInfo> getAllProjects() {
        return projectInfoMapper.selectAll();
    }

    /**
     * 根据服务名称查询服务
     *
     * @param projectName
     * @return
     */
    public List<ComplexMetricsProjectInfo> getProjectInfoByProjectName(String projectName) {
        List<ComplexMetricsProjectInfo> projectInfos = projectInfoMapper.selectByProjectName(projectName);
        return projectInfos;
    }

    /**
     * 保存项目信息
     *
     * @param url
     * @return
     */
    public String saveProjectInfo(String url) {

        String projectName = url.substring(url.lastIndexOf("/") + 1, url.lastIndexOf("."));

        List<ComplexMetricsProjectInfo> projectInfos = getProjectInfoByProjectName(projectName);

        if (projectInfos.isEmpty()) {
            log.info("开始新增项目：" + projectName);
            ComplexMetricsProjectInfo record = new ComplexMetricsProjectInfo();
            record.setProjectName(projectName);
            record.setUrl(url);
            record.setCreateTime(new Date());
            projectInfoMapper.insert(record);
            log.info("项目信息新增成功：" + projectName);
        }

        log.info("项目已经存在：" + projectName);

        // 拉取项目到本地
        String result = cloneRepository(url);

        return result;
    }

    /**
     * 根据git地址创建本地路径
     *
     * @param url
     * @return
     */
    public String getProjectPath(String url) {

        String basePath;
        if (System.getProperty("user.dir").startsWith("/home/jenkins")) {
            basePath = "/home/jenkins/codes/";//properties.getProperty("basePathServer");
        } else {
            basePath = "/Users/changfeng/work/jacoco/codes/";//properties.getProperty("basePathLocal");
        }
        log.info("basePath >>> " + basePath);
        String projectName = url.substring(url.lastIndexOf("/") + 1, url.lastIndexOf("."));
        String projectPath = basePath + projectName;

        File projectFiles = new File(projectPath);
        if (!projectFiles.exists()) {
            log.info("路径不存在，新建路径：" + projectFiles.getAbsolutePath());
            boolean mkdirs = projectFiles.mkdirs();
            if (mkdirs == true) {
                log.info("路径创建成功：" + projectFiles.getAbsolutePath());
                return projectPath;
            } else {
                log.info("路径创建失败：" + projectFiles.getAbsolutePath());
                return "";
            }
        }
        log.info("路径已经存在：" + projectFiles.getAbsolutePath());
        return projectPath;
    }

    /**
     * clone
     *
     * @param url
     */
    public String cloneRepository(String url) {
        log.info("开始clone");
        String projectPath = getProjectPath(url);

        if (projectPath == "") {
            return "clone失败，仓库路径不存在！";
        }

        File gitFile = new File(projectPath + "/.git");

        // 如果存在，fetch
        if (gitFile.exists()) {
            return "clone失败，仓库已经存在" + projectPath;
        }

        log.info("仓库不存在，开始clone：" + projectPath);
        File projectFiles = new File(projectPath);

        try {
            Git.cloneRepository()
                    .setURI(url)
                    .setDirectory(projectFiles)
                    .setCredentialsProvider(CP)
                    .call();
        } catch (Exception e) {
            String message = e.getMessage();
            if (message.contains("Invalid remote: origin")) {
                message = "获取代码失败：找对应项目的开发把 " + USERNAME + " 用户添加gitlab权限！";
            }
            e.printStackTrace();
            return message;
        }

        return "获取代码成功！";

    }

    /**
     * fetch
     *
     * @param url
     */
    public String fetchRepository(String url, String branchName) {

        try {
            String projectPath = getProjectPath(url);

            if (projectPath == "") {
                return "仓库路径不存在！";
            }
            File projectFiles = new File(projectPath);

            if (!projectFiles.exists()) {
                log.info("fetch仓库：" + projectFiles.getAbsolutePath() + "不存在！");
                log.info("保存该不存在到项目……");
                saveProjectInfo(url);
            }

            log.info("开始fetch同步项目代码……");

            Git git = Git.open(projectFiles);
            git.fetch().setCredentialsProvider(CP).call();

            return pullRepository(url, branchName);
        } catch (Exception e) {
            e.printStackTrace();
            return "更新代码失败" + e.getMessage();
        }
    }

    /**
     * pull
     *
     * @param url
     */
    public String pullRepository(String url, String branchName) {

        try {
            File projectFiles = new File(getProjectPath(url));

            log.info("pull仓库地址：" + projectFiles.getAbsolutePath());

            Git git = Git.open(projectFiles);

            List<Ref> branchList = git.branchList().call();

            List<Ref> collect = branchList.stream().filter(ref -> ref.getName().equals("refs/heads/" + branchName)).collect(Collectors.toList());

            if (collect.isEmpty()) {
                log.info(branchName + " 不存在,创建该分支！");
                git.checkout().setCreateBranch(true).setName(branchName).call(); // 创建分支并切换分支
            } else {
                git.checkout().setCreateBranch(false).setName(branchName).call(); // 切换分支
            }

            git.pull().setCredentialsProvider(CP).call(); // 拉取代码  WrongRepositoryStateException:Cannot pull into a repository with state: MERGING

        } catch (Exception e) {
            e.printStackTrace();
            return "更新代码失败：" + e.getMessage();
        }
        return "更新代码成功！";
    }

    /**
     * 获取该项目的所有分支
     *
     * @param projectName
     */
    public List<String> getBranchesByProjectName(String projectName) {

        if (projectName.startsWith("git@") || projectName.startsWith("http://")) {
            projectName = projectName.substring(projectName.lastIndexOf("/") + 1, projectName.lastIndexOf("."));
        }

        String url = projectInfoMapper.selectByProjectName(projectName).get(0).getUrl();
        try {
            File projectFiles = new File(getProjectPath(url));
            log.info("仓库地址：" + projectFiles.getAbsolutePath());

            Git git = Git.open(projectFiles);

            List<Ref> branchListRef = git.branchList().setListMode(ListBranchCommand.ListMode.ALL).call(); // 所有分支，本地和远程
//            List<Ref> branchListRef = git.branchList().call();// 本地分支

            List<String> branchNameList = new ArrayList<>();
            branchListRef.stream().filter(ref -> ref.getName().startsWith("refs/remotes/origin/")).forEach(ref -> branchNameList.add(ref.getName().replace("refs/remotes/origin/", "")));

            return branchNameList;
        } catch (Exception e) {
            if (e.getMessage().contains("repository not found")) {
                return null;
            } else {
                List<String> errorData = new ArrayList();
                errorData.add("报错了");
                return errorData;
            }
        }
    }

    /**
     * 编译项目
     *
     * @param projectName
     */
    public int compileProjectRepository(String projectName) {
        String codeBaseDir;
        String mavenHome;
        if (System.getProperty("user.dir").equals("/home/jenkins")) {
            codeBaseDir = "/home/jenkins/codes/";
            mavenHome = "/var/lib/maven/apache-maven-3.5.4";
        } else {
            codeBaseDir = "/Users/changfeng/work/jacoco/codes/";
            mavenHome = "/Users/changfeng/Programs/apache-maven-3.6.1";
        }

        String pomFile = codeBaseDir + projectName + "/pom.xml";
        InvocationRequest request = new DefaultInvocationRequest();
        request.setPomFile(new File(pomFile));
        request.setGoals(Collections.singletonList("package"));

        Invoker invoker = new DefaultInvoker();
        invoker.setMavenHome(new File(mavenHome));

        try {
            InvocationResult invocationResult = invoker.execute(request);
            int exitCode = invocationResult.getExitCode();
            System.out.println(exitCode);
            return exitCode;
        } catch (MavenInvocationException e) {
            e.printStackTrace();
        }
        return 1;

    }

    public static void main(String[] args) throws Exception {

//        Properties properties = new Properties();
//        properties.load(new FileInputStream("monster-service/src/main/resources/services.properties"));
//        System.out.println(properties.getProperty("basePath"));

        ProjectsService projectsService = new ProjectsService();
        projectsService.compileProjectRepository("big-monster");


    }

}
