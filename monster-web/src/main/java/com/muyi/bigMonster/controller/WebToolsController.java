package com.muyi.bigMonster.controller;

import com.muyi.bigMonster.result.Result;
import com.muyi.bigMonster.service.WebToolsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
@RestController
@RequestMapping("webtools")
public class WebToolsController {

    @Resource
    private WebToolsService webToolsService;

    @PostMapping("updateBuyerResourceEndTime")
    @ResponseBody
    public Result updateBuyerResourceEndTime(@RequestParam Integer buyerResourceId,
                                             @RequestParam String time) {
        log.info("buyerResourceId=" + buyerResourceId + "\ntime=" + time);
        if (null == time || "".equals(time.trim())) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = new Date();
            String now = simpleDateFormat.format(date);
            time = now;
        }

        int number = webToolsService.updateBuyerResourceEndTime(buyerResourceId, time);

        if (0 == number) {
            return Result.Failure("没有找到要更新的数据");
        }

        return Result.Success("成功更新 " + number + " 条数据");

    }
}