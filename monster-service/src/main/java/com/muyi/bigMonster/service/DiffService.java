package com.muyi.bigMonster.service;

import com.muyi.bigMonster.tools.GitTools;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.diff.DiffEntry;
import org.eclipse.jgit.lib.ObjectReader;
import org.eclipse.jgit.lib.Ref;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.revwalk.RevTree;
import org.eclipse.jgit.revwalk.RevWalk;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;
import org.eclipse.jgit.treewalk.AbstractTreeIterator;
import org.eclipse.jgit.treewalk.CanonicalTreeParser;
import org.eclipse.jgit.treewalk.filter.PathSuffixFilter;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * test
 */

@Slf4j
@Service
public class DiffService {

    private static final String PREFIX = "refs/heads/";

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
     * diff by branch
     *
     * @param baseBranch
     * @param diffBranch
     * @return Diff DiffEntry list
     */
    public List<DiffEntry> getDiffEntriesByBranch(String projectPath, String baseBranch, String diffBranch) {
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

//            System.out.println("\nFound All: " + diffs.size() + " differences");
//            for (DiffEntry diff : diffs) {
//                System.out.println("Diff: " + diff.getChangeType() + ": " +
//                        (diff.getOldPath().equals(diff.getNewPath()) ? diff.getNewPath() : diff.getOldPath() + " -> " + diff.getNewPath()));
//            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (GitAPIException e) {
            e.printStackTrace();
        }
        return diffs;
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

//        System.out.println("\nFound modify: " + modifyList.size() + " differences");
//        for (DiffEntry diff : modifyList) {
//            System.out.println("Modify: " + diff.getNewPath());
//        }

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

//        System.out.println("\nFound add: " + addList.size() + " differences");
//        for (DiffEntry diff : addList) {
//            System.out.println("Add: " + diff.getNewPath());
//        }

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

//        System.out.println("\nFound delete: " + deleteList.size() + " differences");
//        for (DiffEntry diff : deleteList) {
//            System.out.println("Delete: " + diff.getNewPath());
//        }

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

        System.out.println("\nFound not delete: " + notDeleteList.size() + " differences");
        for (DiffEntry diff : notDeleteList) {
            System.out.println("Not Delete: " + diff.getChangeType().toString() + " " + diff.getNewPath());
        }

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


    public static void main(String[] args) {
        DiffService diffService = new DiffService();
//        diffService.getNotDelete("/Users/changfeng/work/code/webtools/", "master", "home");

        diffService.getNotDelete(System.getProperty("user.dir"),"master","test");
    }

}

