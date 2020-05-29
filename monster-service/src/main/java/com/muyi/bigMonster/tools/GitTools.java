package com.muyi.bigMonster.tools;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;

import java.io.File;
import java.io.IOException;

public class GitTools {

    public Git git;
    public Repository repository;

    public GitTools(String projectPath) {
        FileRepositoryBuilder builder = new FileRepositoryBuilder();

        try {
            repository = builder.setGitDir(new File(projectPath + "/.git")).build();
        } catch (IOException e) {
            e.printStackTrace();
        }

        git = new Git(repository);

    }

}
