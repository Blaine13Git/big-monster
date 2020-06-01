package com.muyi.bigMonster.controller;

import com.muyi.bigMonster.model.daily1.ComplexMetricsProjectInfo;
import com.muyi.bigMonster.result.PageResult;
import com.muyi.bigMonster.result.Result;
import com.muyi.bigMonster.service.DiffDataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("projects")
public class ProjectsController {

    @Autowired
    private DiffDataService diffDataService;

    /**
     * 获取所有项目信息
     *
     * @return
     */
    @GetMapping("getAllProjects")
    public Result getAllProjects() {
        return Result.Success(diffDataService.getAllProjects());
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

        List<ComplexMetricsProjectInfo> stocks = diffDataService.getProjectInfoByProjectName(projectName);
        Integer id = stocks.get(0).getId();

        log.info(projectName + "的id = " + id.toString());

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
        return Result.Success(diffDataService.saveProjectInfo(url));
    }

    /**
     * 更新项目代码
     *
     * @param url
     * @return
     */
    @PostMapping("fetchCode")
    @ResponseBody
    public Result fetchCode(@RequestParam String url) {
        diffDataService.fetchRepository(url);
        return Result.Success("OK");
    }


}
