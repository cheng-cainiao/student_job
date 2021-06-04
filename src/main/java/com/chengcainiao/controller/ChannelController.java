package com.chengcainiao.controller;

import com.github.pagehelper.PageInfo;
import com.chengcainiao.entity.Channel;
import com.chengcainiao.service.ChannelService;
import com.chengcainiao.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/channel")
public class ChannelController {

    @Autowired
    private ChannelService channelService;

    @PostMapping("create")
    public Result create(@RequestBody Channel channel){
        int flag = channelService.create(channel);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @GetMapping("delete")
    public Result delete(String ids){
        int flag = channelService.delete(ids);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @PostMapping("update")
    public Result update(@RequestBody Channel channel){
        int flag = channelService.update(channel);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @GetMapping("detail")
    public Result detail(Integer id){
        return  Result.ok(channelService.detail(id));
    }

    @PostMapping("query")
    public Map<String,Object> query(@RequestBody  Channel channel){
        PageInfo<Channel> pageInfo = channelService.query(channel);
        return Result.ok(pageInfo);
    }

}
