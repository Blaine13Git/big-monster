package com.muyi.bigMonster.controller;

import com.muyi.bigMonster.result.Result;
import com.muyi.bigMonster.service.BaseTestService;
import com.muyi.bigMonster.service.ProjectsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * test
 */
@Slf4j
@RestController
@RequestMapping("test")
public class BaseTestController {

    @Autowired
    private BaseTestService baseTestService;

    @GetMapping("case01")
    @ResponseBody
    public Result case01() {

        try {
            baseTestService.case01();
            return Result.Success("OK");
        } catch (Exception e) {
            e.printStackTrace();
            return Result.Failure("服务异常：" + e.getMessage());
        }
    }

    @GetMapping("case02")
    @ResponseBody
    public Result case02() {

        try {
            baseTestService.case02();
            return Result.Success("OK");
        } catch (Exception e) {
            e.printStackTrace();
            return Result.Failure("服务异常：" + e.getMessage());
        }
    }

    @GetMapping("case03")
    @ResponseBody
    public Result case03() {

        try {
            baseTestService.case03(111, "2020-05-23 23:00:00");
            return Result.Success("OK");
        } catch (Exception e) {
            e.printStackTrace();
            return Result.Failure("服务异常：" + e.getMessage());
        }
    }

    @GetMapping("case04")
    @ResponseBody
    public Result case04() {

        try {
            baseTestService.case04();
            return Result.Success("OK");
        } catch (Exception e) {
            e.printStackTrace();
            return Result.Failure("服务异常：" + e.getMessage());
        }
    }

    @GetMapping("case05")
    @ResponseBody
    public Result case05() {

        try {
            baseTestService.case05(1, 10);
            return Result.Success("OK");
        } catch (Exception e) {
            e.printStackTrace();
            return Result.Failure("服务异常：" + e.getMessage());
        }
    }

    @GetMapping("case06")
    @ResponseBody
    public Result case06() {

        try {
            baseTestService.case06(1);
            return Result.Success("OK");
        } catch (Exception e) {
            e.printStackTrace();
            return Result.Failure("服务异常：" + e.getMessage());
        }
    }

}
