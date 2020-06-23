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
     * @param projectName
     * @param baseBranch
     * @param diffBranch
     * @return
     */
    @PostMapping("createExec")
    @ResponseBody
    public Result createExec(@RequestParam String projectName,
                             @RequestParam String baseBranch,
                             @RequestParam String diffBranch,
                             @RequestParam String execFileName,
                             @RequestParam String common) {
        try {
            clientExecDataGenerateService.execDataGenerate(projectName, baseBranch, diffBranch);
        } catch (IOException e) {
            e.printStackTrace();
            return Result.Failure("Failure");
        }
        return Result.Success("Success");
    }

    /**
     * @param id
     * @return
     */
    @PostMapping("createReport")
    @ResponseBody
    public Result createReport(int id) {
        try {
            reportGeneratorService.create(id);
        } catch (IOException e) {
            e.printStackTrace();
            return Result.Failure("failure");
        }
        return Result.Success("success");
    }


}
