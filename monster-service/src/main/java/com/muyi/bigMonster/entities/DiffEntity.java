package com.muyi.bigMonster.entities;

import lombok.Data;

@Data
public class DiffEntity {
    private String projectName;
    private String projectPath; // local path
    private String url; //git remote repository url
    private String baseBranch;
    private String diffBranch;

}
