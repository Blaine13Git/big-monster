package com.muyi.bigMonster.service;

import com.muyi.bigMonster.mapper.daily1.ComplexMetricsProjectInfoMapper;
import com.muyi.bigMonster.mapper.daily1.DiffCoverageReportMapper;
import com.muyi.bigMonster.model.daily1.ComplexMetricsProjectInfo;
import com.muyi.bigMonster.model.daily1.DiffCoverageReport;
import com.muyi.bigMonster.model.daily1.DiffCoverageReportExample;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.RowBounds;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.ListBranchCommand;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.lib.Ref;
import org.eclipse.jgit.transport.CredentialsProvider;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 基础工程调试使用
 * test
 */
@Slf4j
@Service
public class ProjectsService {

    private static final String username = "qa-jenkins"; //qa-jenkins

    private static final String password = "*6OGZD9hY5Ylkk$d!Mjv"; //*6OGZD9hY5Ylkk$d!Mjv

    private static final CredentialsProvider CP = new UsernamePasswordCredentialsProvider(username, password);

    @Resource
    private ComplexMetricsProjectInfoMapper projectInfoMapper;


    @Resource
    private DiffCoverageReportMapper diffCoverageReportMapper;

    /**
     * 获取所有数据个数
     *
     * @return
     */
    public long totalCoverageReport(String projectName, String baseBranch, String diffBranch) {
        DiffCoverageReportExample example = new DiffCoverageReportExample();
        if (!projectName.isEmpty()) {
            example.createCriteria().andProjectnameEqualTo(projectName);
        }

        if (!baseBranch.isEmpty()) {
            example.createCriteria().andBasebranchEqualTo(baseBranch);
        }

        if (!diffBranch.isEmpty()) {
            example.createCriteria().andDiffbranchEqualTo(diffBranch);
        }
        long total = diffCoverageReportMapper.countByExample(example);
        return total;
    }

    /**
     * @param currentPage
     * @param pageSize
     * @return
     */
    public List<DiffCoverageReport> getDiffRecordByParams(String projectName, String baseBranch, String diffBranch, int currentPage, int pageSize) {
        DiffCoverageReportExample example = new DiffCoverageReportExample();
        if (!projectName.isEmpty()) {
            example.createCriteria().andProjectnameEqualTo(projectName);
        }

        if (!baseBranch.isEmpty()) {
            example.createCriteria().andBasebranchEqualTo(baseBranch);
        }

        if (!diffBranch.isEmpty()) {
            example.createCriteria().andDiffbranchEqualTo(diffBranch);
        }

        RowBounds rowBounds = new RowBounds((currentPage - 1) * pageSize, pageSize);
        List<DiffCoverageReport> diffCoverageReports = diffCoverageReportMapper.selectByExampleWithRowbounds(example, rowBounds);
        return diffCoverageReports;
    }

    /**
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
    public int saveProjectInfo(String url) {

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
        cloneRepository(url);

        return 0;
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
            basePath = "/Users/changfeng/work/code/";//properties.getProperty("basePathLocal");
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
    public void cloneRepository(String url) {

        String projectPath = getProjectPath(url);

        if (projectPath == "") {
            log.info("仓库路径不存在！");
            return;
        }

        File gitFile = new File(projectPath + "/.git");

        // 如果存在，fetch
        if (gitFile.exists()) {
            log.info("clone仓库已经存在" + projectPath);
            return;
        }

        log.info("仓库不存在，开始clone：" + projectPath);
        File projectFiles = new File(projectPath);

        try {
            Git.cloneRepository()
                    .setURI(url)
                    .setDirectory(projectFiles)
                    .setCredentialsProvider(CP)
                    .call();
        } catch (GitAPIException e) {
            e.printStackTrace();
        }

    }

    /**
     * fetch
     *
     * @param url
     */
    public void fetchRepository(String url, String branchName) {

        try {
            String projectPath = getProjectPath(url);

            if (projectPath == "") {
                log.info("仓库路径不存在！");
                return;
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

            pullRepository(url, branchName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * pull
     *
     * @param url
     */
    public void pullRepository(String url, String branchName) {

        try {
            File projectFiles = new File(getProjectPath(url));

            log.info("pull仓库地址：" + projectFiles.getAbsolutePath());

            Git git = Git.open(projectFiles); // 打开仓库

            List<Ref> branchList = git.branchList().call();

            List<Ref> collect = branchList.stream().filter(ref -> ref.toString().contains(branchName)).collect(Collectors.toList());

            if (collect.isEmpty()) {
                log.info("分支：" + branchName + "不存在");
                git.checkout().setCreateBranch(true).setName(branchName).call(); // 切换创建分支并切换分支
            } else {
                git.checkout().setCreateBranch(false).setName(branchName).call(); // 切换分支
            }

            git.pull().setCredentialsProvider(CP).call(); // 拉取代码  WrongRepositoryStateException:Cannot pull into a repository with state: MERGING

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取该项目的所有分支
     *
     * @param projectName
     */
    public List<String> getBranchesByProjectName(String projectName) {
        String url = projectInfoMapper.selectByProjectName(projectName).get(0).getUrl();
        List<String> branchNameList;
        try {
            File projectFiles = new File(getProjectPath(url));
            log.info("仓库地址：" + projectFiles.getAbsolutePath());

            Git git = Git.open(projectFiles);

            List<Ref> branchListRef = git.branchList().setListMode(ListBranchCommand.ListMode.ALL).call(); // 所有分支，本地和远程
//            List<Ref> branchListRef = git.branchList().call();// 本地分支

            branchNameList = new ArrayList<>();
            branchListRef.stream().filter(ref -> ref.getName().startsWith("refs/remotes/origin/")).forEach(ref -> branchNameList.add(ref.getName().replace("refs/remotes/origin/", "")));

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return branchNameList;
    }

    public static void main(String[] args) throws Exception {
//        DiffDataService diffDataService = new DiffDataService();
//        diffDataService.pullRepository("http://gitlab.ops.yangege.cn/zebra/live.git", "refs/heads/QA-for-test");

//        Properties properties = new Properties();
//        properties.load(new FileInputStream("monster-service/src/main/resources/services.properties"));
//        System.out.println(properties.getProperty("basePath"));


    }
}
