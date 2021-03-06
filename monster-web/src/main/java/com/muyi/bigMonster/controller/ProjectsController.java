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
public class ProjectsController {

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
        if (branchesByProjectName == null) {
            return Result.Failure("仓库空了，重新添加项目");
        } else {
            return Result.Success(branchesByProjectName);
        }
    }

    /**
     * 获取项目所有分支-远程
     *
     * @param projectPath
     * @return
     */
    @PostMapping("getProjectBranchNameByUrl")
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
        String message = projectsService.saveProjectInfo(url);
        if (message.contains("失败")) {
            return Result.Failure(message);
        } else {
            return Result.Success(message);
        }
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

        String message = projectsService.fetchRepository(url, branchName);
        if (message.contains("失败")) {
            return Result.Failure(message);
        } else {
            return Result.Success(message);
        }
    }

    @PostMapping("compileProjectRepository")
    @ResponseBody
    public Result compileProjectRepository(@RequestParam String projectName) {

        int resultCode = projectsService.compileProjectRepository(projectName);
        if (resultCode == 0) {
            return Result.Success("编译成功");
        } else {
            return Result.Failure("编译失败");
        }
    }

}
