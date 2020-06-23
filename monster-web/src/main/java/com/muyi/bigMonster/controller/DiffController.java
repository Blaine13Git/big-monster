package com.muyi.bigMonster.controller;

import com.muyi.bigMonster.model.daily1.DiffCoverageReport;
import com.muyi.bigMonster.result.PageResult;
import com.muyi.bigMonster.result.Result;
import com.muyi.bigMonster.service.DiffService;
import com.muyi.bigMonster.service.ProjectsService;
import org.eclipse.jgit.diff.DiffEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("diffBranch")
public class DiffController {

    @Autowired
    private DiffService diffService;

    @Autowired
    private ProjectsService projectsService;

    /**
     * 获取总 diff 的 class
     *
     * @param baseBranch
     * @param diffBranch
     * @return
     */
    @PostMapping("diffClass")
    @ResponseBody
    public Result diffClass(@RequestParam String projectPath,
                            @RequestParam String baseBranch,
                            @RequestParam String diffBranch) {

        List<DiffEntry> diffClassList = diffService.getDiffEntriesByBranch(projectPath, baseBranch, diffBranch);
        return Result.Success(diffClassList);
    }

    /**
     * 获取修改的文件
     *
     * @param baseBranch
     * @param diffBranch
     * @return
     */
    @PostMapping("modifyClass")
    @ResponseBody
    public Result modifyClass(@RequestParam String projectPath,
                              @RequestParam String baseBranch,
                              @RequestParam String diffBranch) {

        List<DiffEntry> modifyList = diffService.getModify(projectPath, baseBranch, diffBranch);
        return Result.Success(modifyList);
    }

    /**
     * 获取新增的文件
     *
     * @param baseBranch
     * @param diffBranch
     * @return
     */
    @PostMapping("addClass")
    @ResponseBody
    public Result addClass(@RequestParam String projectPath,
                           @RequestParam String baseBranch,
                           @RequestParam String diffBranch) {

        List<DiffEntry> addClassList = diffService.getAdd(projectPath, baseBranch, diffBranch);
        return Result.Success(addClassList);
    }


    /**
     * 获取删除的文件
     *
     * @param baseBranch
     * @param diffBranch
     * @return
     */
    @PostMapping("delClass")
    @ResponseBody
    public Result delClass(@RequestParam String projectPath,
                           @RequestParam String baseBranch,
                           @RequestParam String diffBranch) {

        List<DiffEntry> delClassList = diffService.getDelete(projectPath, baseBranch, diffBranch);
        return Result.Success(delClassList);
    }

    @PostMapping("getDiffRecord")
    @ResponseBody
    public Result getDiffRecordByParams(@RequestParam String projectName,
                                        @RequestParam String baseBranch,
                                        @RequestParam String diffBranch,
                                        @RequestParam int currentPage,
                                        @RequestParam int pageSize) {


        List<DiffCoverageReport> allCoverageReports = projectsService.getDiffRecordByParams(projectName, baseBranch, diffBranch, currentPage, pageSize);

        PageResult pageResult = new PageResult();
        pageResult.setTotal(projectsService.totalCoverageReport(projectName, baseBranch, diffBranch));
        pageResult.setList(allCoverageReports);

        return Result.Success(pageResult);
    }


}
