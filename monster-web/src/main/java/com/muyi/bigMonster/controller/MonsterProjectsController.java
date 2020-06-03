package com.muyi.bigMonster.controller;

import com.muyi.bigMonster.model.daily1.ComplexMetricsProjectInfo;
import com.muyi.bigMonster.result.Result;
import com.muyi.bigMonster.service.ProjectsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("projects")
public class MonsterProjectsController {

    @Autowired
    private ProjectsService projectsService;

    /**
     * 获取所有项目信息
     *
     * @return
     */
    @GetMapping("getAllProjects")
    @ResponseBody
    public Result getAllProjects() {
        return Result.Success(projectsService.getAllProjects());
    }

    /**
     * 获取项目所有分支-远程
     *
     * @param projectName
     * @return
     */
    @PostMapping("getProjectBranchName")
    @ResponseBody
    public Result getProjectBranchName(@RequestParam String projectName) {
        List<String> branchesByProjectName = projectsService.getBranchesByProjectName(projectName);
        return Result.Success(branchesByProjectName);
    }

    /**
     * 获取项目所有分支-远程
     *
     * @param projectPath
     * @return
     */
    @PostMapping("getProjectBranchName")
    @ResponseBody
    public Result getProjectBranchNameByUrl(@RequestParam String projectPath) {
        List<String> branchesByProjectName = projectsService.getBranchesByProjectName(projectPath);
        return Result.Success(branchesByProjectName);
    }

    /**
     * 获取项目信息
     *
     * @param projectName
     * @return
     */
    @PostMapping("getProjectInfo")
    @ResponseBody
    public Result getProjectInfo(@RequestParam String projectName) {

        List<ComplexMetricsProjectInfo> stocks = projectsService.getProjectInfoByProjectName(projectName);
        Integer id = stocks.get(0).getId();

        log.info(projectName + "的id = " + id.toString());
        log.info(projectName + "的Name = " + stocks.get(0).getProjectName());

        return Result.Success(stocks);

    }

    /**
     * 保存项目
     *
     * @param url
     * @return
     */
    @PostMapping("saveProjectInfo")
    @ResponseBody
    public Result saveProjectInfo(@RequestParam String url) {
        if (url.startsWith("git@")) {
            url = url.replace(":", "/");
            url = url.replace("git@", "http://");
        }
        return Result.Success(projectsService.saveProjectInfo(url));
    }

    /**
     * 更新项目代码
     *
     * @param url
     * @return
     */
    @PostMapping("fetchCode")
    @ResponseBody
    public Result fetchCode(@RequestParam String url,
                            @RequestParam String branchName) {
        if (url.startsWith("git@")) {
            url = url.replace(":", "/");
            url = url.replace("git@", "http://");
        }

        projectsService.fetchRepository(url, "refs/heads/" + branchName);
        return Result.Success("OK");
    }


}
