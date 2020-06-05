package com.muyi.bigMonster.controller;

import com.muyi.bigMonster.model.daily2drds.PBuyerResource;
import com.muyi.bigMonster.result.Result;
import com.muyi.bigMonster.service.WebToolsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
        return Result.Success("成功更新 " + number + " 条数据!");
    }

    /**
     * 获取用户未过期的券
     *
     * @param accountId
     * @return
     */
    @PostMapping("getUsefulBuyerResource")
    @ResponseBody
    public Result getUsefulBuyerResource(@RequestParam Long accountId) {
        log.info("accountId >>>" + accountId);
        List<PBuyerResource> usefulBuyerResource = webToolsService.getUsefulBuyerResource(accountId);

        return Result.Success(usefulBuyerResource);
    }

    /**
     * 获取用户过期的券
     *
     * @param accountId
     * @return
     */
    @PostMapping("getOverdueBuyerResource")
    @ResponseBody
    public Result getOverdueBuyerResource(@RequestParam Long accountId) {
        log.info("accountId >>>" + accountId);
        List<PBuyerResource> usefulBuyerResource = webToolsService.getOverdueBuyerResource(accountId);

        return Result.Success(usefulBuyerResource);
    }
}
