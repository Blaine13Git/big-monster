package com.muyi.bigMonster.service;

import com.muyi.bigMonster.mapper.daily1.ComplexMetricsProjectInfoMapper;
import com.muyi.bigMonster.mapper.daily1.LiveVideoAttributeMapper;
import com.muyi.bigMonster.mapper.daily2drds.PBuyerResourceMapper;
import com.muyi.bigMonster.model.daily1.ComplexMetricsProjectInfo;
import com.muyi.bigMonster.model.daily1.LiveVideoAttribute;
import com.muyi.bigMonster.model.daily2drds.PBuyerResource;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.lib.Ref;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.transport.CredentialsProvider;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Properties;
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
    private LiveVideoAttributeMapper liveVideoAttributeMapper;

    @Resource
    private PBuyerResourceMapper pBuyerResourceMapper;

    @Resource
    private ComplexMetricsProjectInfoMapper projectInfoMapper;

    public void case01() {
        LiveVideoAttribute liveVideoAttribute = liveVideoAttributeMapper.selectByPrimaryKey(1);
        Integer accountId = liveVideoAttribute.getAccountId();
        System.out.println("accountId:" + accountId);

    }

    public void case02() {
        PBuyerResource pBuyerResource = pBuyerResourceMapper.selectByPrimaryKey(200468L);
        Long accountId = pBuyerResource.getAccountId();
        System.out.println("accountId:" + accountId);

    }

    public void case03(Integer buyerResourceId, String time) {
        int number = pBuyerResourceMapper.updateById(1406249, "2020-05-23 23:00:00");
        System.out.println("update number:" + number);
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

        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("monster-service/src/main/resources/services.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String basePath;
        if (System.getProperty("user.dir").contains("jenkins")) {
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
                git.checkout().setCreateBranch(true).setName(branchName).call(); // 切换分支
            }

            git.checkout().setCreateBranch(false).setName(branchName).call(); // 切换分支

            git.pull().setCredentialsProvider(CP).call(); // 拉取代码  WrongRepositoryStateException:Cannot pull into a repository with state: MERGING

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void getBranches(String url) {

        try {
            File projectFiles = new File(getProjectPath(url));
            log.info("仓库地址：" + projectFiles.getAbsolutePath());

            Git git = Git.open(projectFiles);

            Iterable<RevCommit> commit_logs = git.log().all().call();
            RevCommit latestCommit = commit_logs.iterator().next();

            Repository repo = git.getRepository();
            String branch = repo.getBranch();

            String name = latestCommit.getName();
            String message = latestCommit.getFullMessage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
//        DiffDataService diffDataService = new DiffDataService();
//        diffDataService.pullRepository("http://gitlab.ops.yangege.cn/zebra/live.git", "refs/heads/QA-for-test");

//        Properties properties = new Properties();
//        properties.load(new FileInputStream("monster-service/src/main/resources/services.properties"));
//        System.out.println(properties.getProperty("basePath"));


    }
}