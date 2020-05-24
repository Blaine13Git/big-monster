package com.muyi.bigMonster.controller;

import com.muyi.bigMonster.result.Result;
import com.muyi.bigMonster.service.DiffService;
import org.eclipse.jgit.lib.Repository;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
@RequestMapping("diff")
public class DiffController {

    @Resource
    private DiffService diffService;

    /**
     * 获取变动文件总数
     * @param baseBranch
     * @param diffBranch
     * @return
     */
    @PostMapping("diffClassNumber")
    @ResponseBody
    public Result diffClassNumber(@RequestParam String baseBranch,
                                  @RequestParam String diffBranch) {

        Repository repository = DiffService.getRepository();
        int diffFileNumber = diffService.getDiffFileNumber(repository, baseBranch, diffBranch);
        return Result.Success(diffFileNumber);
    }

}
