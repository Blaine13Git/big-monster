package com.muyi.bigMonster.controller;

import com.ggj.hqbs.live.api.RoomApi;
import com.ggj.platform.gsf.result.PlainResult;
import com.muyi.bigMonster.result.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/live/tools")
public class LiveToolsController {

    @Resource(name = "roomApi")
    private RoomApi roomApi;

    /**
     * 创建直播间
     *
     * @param accountId 用户ID
     * @param roomId    房间ID
     * @return
     */
    @PostMapping("/creatLiveRoom")
    @ResponseBody
    public Result creatLiveRoom(@RequestParam Integer accountId, @RequestParam String roomId) {

//        log.info("accountId:" + accountId);
//        log.info("roomId:" + roomId);
        try {

            PlainResult room = roomApi.createRoom(accountId, roomId);
//            log.info("Code:" + room.getCode());
//            log.info("Message:" + room.getMessage());
//            log.info("Data:" + room.getData());

            return Result.Success(room);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.Failure("服务异常：" + e.getMessage());
        }
    }

}
