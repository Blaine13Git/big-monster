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
     * 获取修改的文件
     *
     * @param baseBranch
     * @param diffBranch
     * @return
     */
    @PostMapping("modify")
    @ResponseBody
    public Result modify(@RequestParam String baseBranch,
                         @RequestParam String diffBranch) {

        List<DiffEntry> modifyList = diffService.getModify(baseBranch, diffBranch);
        return Result.Success(modifyList);
    }

    /**
     * 获取新增的文件
     *
     * @param baseBranch
     * @param diffBranch
     * @return
     */
    @PostMapping("add")
    @ResponseBody
    public Result add(@RequestParam String baseBranch,
                      @RequestParam String diffBranch) {

        List<DiffEntry> modifyList = diffService.getAdd(baseBranch, diffBranch);
        return Result.Success(modifyList);
    }


}
