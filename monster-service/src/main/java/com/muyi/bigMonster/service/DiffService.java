package com.muyi.bigMonster.service;

import com.muyi.bigMonster.mapper.daily1.ComplexMetricsProjectInfoMapper;
import com.muyi.bigMonster.tools.GitTools;
import com.muyi.bigMonster.tools.JDTTools;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jgit.diff.DiffEntry;
import org.eclipse.jgit.lib.*;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.revwalk.RevTree;
import org.eclipse.jgit.revwalk.RevWalk;
import org.eclipse.jgit.treewalk.AbstractTreeIterator;
import org.eclipse.jgit.treewalk.CanonicalTreeParser;
import org.eclipse.jgit.treewalk.TreeWalk;
import org.eclipse.jgit.treewalk.filter.PathSuffixFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * test
 */

@Slf4j
@Service
public class DiffService {

    @Autowired
    private ProjectsService projectsService;

    @Resource
    private ComplexMetricsProjectInfoMapper complexMetricsProjectInfoMapper;

    private static final String PREFIX = "refs/heads/";

    public DiffService() {

    }

    private String getProjectUrl(String projectPath) {
        int index = projectPath.lastIndexOf("/") + 1;
        String url = complexMetricsProjectInfoMapper.selectByProjectName(projectPath.substring(index)).get(0).getUrl();
        return url;
    }

    /**
     * diff by branch
     *
     * @param baseBranch
     * @param diffBranch
     * @return Diff DiffEntry list
     */
    public List<DiffEntry> getDiffEntriesByBranch(String projectPath, String baseBranch, String diffBranch) {
        String url = getProjectUrl(projectPath);
        projectsService.pullRepository(url, diffBranch);
        GitTools gitTools = new GitTools(projectPath);
        List<DiffEntry> diffs = null;
        try {
            if (gitTools.repository.exactRef(PREFIX + diffBranch) == null) {
                // first we need to ensure that the remote branch is visible locally
                Ref ref = gitTools.git.branchCreate().setName(diffBranch).setStartPoint("origin/" + diffBranch).call();
                System.out.println("Created local branch with ref: " + ref);
            }

            AbstractTreeIterator baseBranchTree = prepareTreeParserBranch(gitTools.repository, PREFIX + baseBranch);
            AbstractTreeIterator diffBranchTree = prepareTreeParserBranch(gitTools.repository, PREFIX + diffBranch);

            diffs = gitTools.git.diff()
                    .setOldTree(baseBranchTree)
                    .setNewTree(diffBranchTree)
                    .setPathFilter(PathSuffixFilter.create(".java"))
                    .call();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return diffs;
    }


    /**
     * @param repository 代码仓库
     * @param branchName 例如"refs/heads/master"
     * @return
     * @throws IOException
     */
    private static AbstractTreeIterator prepareTreeParserBranch(Repository repository, String branchName) throws IOException {
        Ref ref = repository.exactRef(branchName);
        try (RevWalk walk = new RevWalk(repository)) {
            RevCommit commit = walk.parseCommit(ref.getObjectId());
            RevTree tree = walk.parseTree(commit.getTree().getId());

            CanonicalTreeParser treeParser = new CanonicalTreeParser();
            try (ObjectReader reader = repository.newObjectReader()) {
                treeParser.reset(reader, tree.getId());
            }
            walk.dispose();
            return treeParser;
        }
    }

    /**
     * 获取修改
     *
     * @param baseBranch
     * @param diffBranch
     * @return 返回修改的list
     */
    public List<DiffEntry> getModify(String projectPath, String baseBranch, String diffBranch) {
        List<DiffEntry> diffEntries = getDiffEntriesByBranch(projectPath, baseBranch, diffBranch);
        List<DiffEntry> modifyList = diffEntries.stream().filter(diffEntry -> diffEntry.getChangeType().toString().equals("MODIFY")).collect(Collectors.toList());
        return modifyList;
    }

    /**
     * 获取新增
     *
     * @param baseBranch
     * @param diffBranch
     * @return 返回新增的list
     */
    public List<DiffEntry> getAdd(String projectPath, String baseBranch, String diffBranch) {
        List<DiffEntry> diffEntries = getDiffEntriesByBranch(projectPath, baseBranch, diffBranch);
        List<DiffEntry> addList = diffEntries.stream().filter(diffEntry -> diffEntry.getChangeType().toString().equals("ADD")).collect(Collectors.toList());
        return addList;
    }

    /**
     * 获取删除的内容
     *
     * @param baseBranch
     * @param diffBranch
     * @return 返回删除的list
     */
    public List<DiffEntry> getDelete(String projectPath, String baseBranch, String diffBranch) {
        List<DiffEntry> diffEntries = getDiffEntriesByBranch(projectPath, baseBranch, diffBranch);
        List<DiffEntry> deleteList = diffEntries.stream().filter(diffEntry -> diffEntry.getChangeType().toString().equals("DELETE")).collect(Collectors.toList());
        return deleteList;
    }

    /**
     * 获取非删除的内容（即modify & add）
     *
     * @param baseBranch
     * @param diffBranch
     * @return 返回删除的list
     */
    public List<DiffEntry> getNotDelete(String projectPath, String baseBranch, String diffBranch) {
        List<DiffEntry> diffEntries = getDiffEntriesByBranch(projectPath, baseBranch, diffBranch);
        List<DiffEntry> notDeleteList = diffEntries.stream().filter(diffEntry -> !(diffEntry.getChangeType().toString().equals("DELETE"))).collect(Collectors.toList());
        return notDeleteList;
    }

    /**
     * 判断是否为diff文件
     *
     * @param classname
     * @return <code>true</code> 表示是diff文件
     */
    public boolean isDiff(String classname, String projectPath, String baseBranch, String diffBranch) {
        List<DiffEntry> notDeleteDiffEntries = getNotDelete(projectPath, baseBranch, diffBranch);
        for (DiffEntry diffEntry : notDeleteDiffEntries) {
            if (diffEntry.getNewPath().contains(classname)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 获取指定分支--指定文件de内容
     *
     * @param projectPath
     * @param branchName
     * @param fileName
     * @return
     * @throws Exception
     */
    public String getFileContentByBranch(String projectPath, String branchName, String fileName) {
        String url = getProjectUrl(projectPath);
        projectsService.pullRepository(url, branchName);
        try {
            GitTools gitTools = new GitTools(projectPath);
            Ref branch = gitTools.repository.exactRef("refs/heads/" + branchName);
            ObjectId objId = branch.getObjectId();
            RevWalk walk = new RevWalk(gitTools.repository);
            RevTree tree = walk.parseTree(objId);
            TreeWalk treeWalk = TreeWalk.forPath(gitTools.repository, fileName, tree);
            ObjectId objectId = treeWalk.getObjectId(0);
            ObjectLoader loader = gitTools.repository.open(objectId);
            byte[] bytes = loader.getBytes();
            walk.dispose();
            return new String(bytes);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * 获取变更类的所有方法的MD5值
     *
     * @param projectPath
     * @param branchName
     * @param fileName
     * @return
     */
    public Map<String, String> getMD5s(String projectPath, String branchName, String fileName) {

        Map<String, String> methodMD5s = new HashMap<>();

        String fileContentByBranch = getFileContentByBranch(projectPath, branchName, fileName);

        JDTTools jdtTools = new JDTTools();
        MethodDeclaration[] methods = jdtTools.getMethods(fileContentByBranch);

        for (MethodDeclaration methodDeclaration : methods) {
            String methodMD5 = jdtTools.getMethodMD5(methodDeclaration);
            methodMD5s.put(methodDeclaration.getName().toString(), methodMD5);
        }

        // test
        /*methodMD5s.entrySet().stream().forEach(md5 -> {
            System.out.println("MethodName：" + md5.getKey());
            System.out.println("MD5值：" + md5.getValue());
        });*/

        return methodMD5s;
    }


    public static void main(String[] args) {
        DiffService diffService = new DiffService();
//        diffService.getNotDelete("/Users/changfeng/work/code/webtools/", "master", "home");

        String projectPath = "/Users/changfeng/work/jacoco/codes/big-monster";

        List<DiffEntry> notDeletes = diffService.getNotDelete(projectPath, "master", "test");

        for (DiffEntry diffEntry : notDeletes) {
            String newPath = diffEntry.getNewPath();
            diffService.getMD5s(projectPath, "master", newPath);
        }

    }

}



