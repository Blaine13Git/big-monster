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

        } catch (IOException e) {
            e.printStackTrace();
        } catch (GitAPIException e) {
            e.printStackTrace();
        }
        return diffs;
    }

    /**
     * 获取修改的文件数
     *
     * @param repository
     * @param baseBranch
     * @param diffBranch
     * @return diff file number
     */
    public int getDiffFileNumber(Repository repository, String baseBranch, String diffBranch) {
        List<DiffEntry> diffEntries = getDiffEntriesByBranch(baseBranch, diffBranch);
        int diffNumber = 0;
//        diffEntries.stream().filter(diffEntry -> diffEntry.getChangeType().equals())
        return diffEntries.size();
    }

    public static void main(String[] args) {

        DiffService diffService = new DiffService();

        List<DiffEntry> diffs = diffService.getDiffEntriesByBranch("master", "test");

        System.out.println("Found: " + diffs.size() + " differences");

        for (DiffEntry diff : diffs) {
            System.out.println("Diff: " + diff.getChangeType() + ": " +
                    (diff.getOldPath().equals(diff.getNewPath()) ? diff.getNewPath() : diff.getOldPath() + " -> " + diff.getNewPath()));
        }
    }


}

