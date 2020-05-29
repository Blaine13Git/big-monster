package com.muyi.bigMonster.controller;

import com.muyi.bigMonster.result.Result;
import com.muyi.bigMonster.service.ClientExecDataGenerateService;
import com.muyi.bigMonster.service.ReportGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("report")
public class ReportController {

    @Autowired
    private ClientExecDataGenerateService clientExecDataGenerateService;

    @Autowired
    private ReportGeneratorService reportGeneratorService;

    /**
     * @param ip
     * @param port
     * @param destFilePath
     * @return
     */
    @PostMapping("createExec")
    @ResponseBody
    public Result createExec(String ip, Integer port, String destFilePath) {
        try {
            clientExecDataGenerateService.execDataGenerate(ip, port, destFilePath);
        } catch (IOException e) {
            e.printStackTrace();
            return Result.Failure("failure");
        }

        return Result.Success("success");
    }

    /**
     * @param executionDataFilePath
     * @param projectFilePath
     * @return
     */
    @PostMapping("createReport")
    @ResponseBody
    public Result createReport(String executionDataFilePath, String projectFilePath) {
        try {
            reportGeneratorService.create(executionDataFilePath, projectFilePath);
        } catch (IOException e) {
            e.printStackTrace();
            return Result.Failure("failure");
        }

        return Result.Success("success");
    }


}
