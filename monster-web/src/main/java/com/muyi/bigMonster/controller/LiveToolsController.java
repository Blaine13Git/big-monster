package com.muyi.bigMonster.controller;

import com.ggj.hqbs.live.api.RoomApi;
import com.ggj.platform.gsf.result.PlainResult;
import com.muyi.bigMonster.result.Result;
import com.muyi.bigMonster.service.DataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("live")
public class LiveToolsController {

    @Autowired
    private RoomApi roomApi;

    @Autowired
    private DataService dataService;

    /**
     * 创建直播间
     *
     * @param accountId 用户ID
     * @param roomId    房间ID
     * @return
     */
    @PostMapping("creatLiveRoom")
    @ResponseBody
    public Result creatLiveRoom(@RequestParam Integer accountId, @RequestParam String roomId) {

        log.info("accountId:" + accountId);
        log.info("roomId:" + roomId);
        try {

            PlainResult room = roomApi.createRoom(accountId, roomId);
            log.info("Code:" + room.getCode());
            log.info("Message:" + room.getMessage());
            log.info("Data:" + room.getData());

            return Result.Success(room);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.Failure("服务异常：" + e.getMessage());
        }
    }

    @GetMapping("case01")
    @ResponseBody
    public Result case01() {

        try {
            dataService.case01();
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
            dataService.case02();
            return Result.Success("OK");
        } catch (Exception e) {
            e.printStackTrace();
            return Result.Failure("服务异常：" + e.getMessage());
        }
    }

}
