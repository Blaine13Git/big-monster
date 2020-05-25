package com.muyi.bigMonster.service;

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
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class DiffService {
    private static Git git;
    private static Repository repository;
    private static final String PREFIX = "refs/heads/";

    public DiffService() {
        // 获取git对象--单例DCL模式
        if (null == repository) {
            synchronized (DiffService.class) {
                if (null == repository) {
                    try {

                        // 方式1
                        FileRepositoryBuilder builder = new FileRepositoryBuilder();
                        repository = builder.readEnvironment().findGitDir().build();

                        // 方式2
//                        String projectPath = System.getProperty("user.dir");
//                        repository = builder.setGitDir(new File(projectPath + "/.git")).build();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        // 获取repository对象--单例DCL模式
        if (null == git) {
            synchronized (DiffService.class) {
                if (null == git) {
                    git = new Git(repository);
                }
            }
        }

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
     * diff by branch
     *
     * @param baseBranch
     * @param diffBranch
     * @return Diff DiffEntry list
     */
    public List<DiffEntry> getDiffEntriesByBranch(String baseBranch, String diffBranch) {
        List<DiffEntry> diffs = null;
        try {

            if (repository.exactRef(PREFIX + diffBranch) == null) {
                // first we need to ensure that the remote branch is visible locally
                Ref ref = git.branchCreate().setName(diffBranch).setStartPoint("origin/" + diffBranch).call();
                System.out.println("Created local branch with ref: " + ref);
            }

            AbstractTreeIterator baseBranchTree = prepareTreeParserBranch(repository, PREFIX + baseBranch);
            AbstractTreeIterator diffBranchTree = prepareTreeParserBranch(repository, PREFIX + diffBranch);

            diffs = git.diff()
                    .setOldTree(baseBranchTree)
                    .setNewTree(diffBranchTree)
                    .setPathFilter(PathSuffixFilter.create(".java"))
                    .call();

            /*System.out.println("\nFound All: " + diffs.size() + " differences");
            for (DiffEntry diff : diffs) {
                System.out.println("Diff: " + diff.getChangeType() + ": " +
                        (diff.getOldPath().equals(diff.getNewPath()) ? diff.getNewPath() : diff.getOldPath() + " -> " + diff.getNewPath()));
            }*/

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
    public List<DiffEntry> getModify(String baseBranch, String diffBranch) {
        List<DiffEntry> diffEntries = getDiffEntriesByBranch(baseBranch, diffBranch);
        List<DiffEntry> modifyList = diffEntries.stream().filter(diffEntry -> diffEntry.getChangeType().toString().equals("MODIFY")).collect(Collectors.toList());

        System.out.println("\nFound modify: " + modifyList.size() + " differences");
        for (DiffEntry diff : modifyList) {
            System.out.println("Modify: " + diff.getNewPath());
        }

        return modifyList;
    }

    /**
     * 获取新增
     *
     * @param baseBranch
     * @param diffBranch
     * @return 返回新增的list
     */
    public List<DiffEntry> getAdd(String baseBranch, String diffBranch) {
        List<DiffEntry> diffEntries = getDiffEntriesByBranch(baseBranch, diffBranch);
        List<DiffEntry> addList = diffEntries.stream().filter(diffEntry -> diffEntry.getChangeType().toString().equals("ADD")).collect(Collectors.toList());

        System.out.println("\nFound add: " + addList.size() + " differences");
        for (DiffEntry diff : addList) {
            System.out.println("Add: " + diff.getNewPath());

            // 去掉模块名称
            int indexStart = diff.getNewPath().indexOf("/");
            String classPath = diff.getNewPath().substring(indexStart + 1);
            System.out.println("Add: " + classPath);

            try {
                String classPackage = classPath.replace("/", ".");
                int indexEnd = classPackage.lastIndexOf(".");
                String fullClassNamePlus = classPackage.substring(0, indexEnd);

                String fullClassName = fullClassNamePlus.replace("src.main.java.","");
                System.out.println(fullClassName);

                String PackageName = Class.forName(fullClassName).getPackage().getName();

//                String name = Class.forName("com.muyi.bigMonster.controller.WebToolsController").getPackage().getName();

                System.out.println(PackageName);

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        return addList;
    }

    /**
     * 获取删除的内容
     *
     * @param baseBranch
     * @param diffBranch
     * @return 返回删除的list
     */
    public List<DiffEntry> geDelete(String baseBranch, String diffBranch) {
        List<DiffEntry> diffEntries = getDiffEntriesByBranch(baseBranch, diffBranch);
        List<DiffEntry> deleteList = diffEntries.stream().filter(diffEntry -> diffEntry.getChangeType().toString().equals("DELETE")).collect(Collectors.toList());

        System.out.println("\nFound delete: " + deleteList.size() + " differences");
        for (DiffEntry diff : deleteList) {
            System.out.println("Delete: " + diff.getNewPath());
        }

        return deleteList;
    }

    public static void main(String[] args) {

        DiffService diffService = new DiffService();

//        List<DiffEntry> modify = diffService.getModify("master", "test");
        List<DiffEntry> add = diffService.getAdd("master", "test");


    }

}

