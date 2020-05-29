package com.muyi.bigMonster.controller;

import com.muyi.bigMonster.result.Result;
import com.muyi.bigMonster.service.DiffService;
import org.eclipse.jgit.diff.DiffEntry;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("diff")
public class DiffController {

    @Resource
    private DiffService diffService;

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

        List<DiffEntry> delClassList = diffService.getAdd(projectPath, baseBranch, diffBranch);
        return Result.Success(delClassList);
    }


}