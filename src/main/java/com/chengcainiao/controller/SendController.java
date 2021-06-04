package com.chengcainiao.controller;

import com.github.pagehelper.PageInfo;
import com.chengcainiao.entity.Send;
import com.chengcainiao.service.SendService;
import com.chengcainiao.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/send")
public class SendController {

    @Autowired
    private SendService sendService;

    @PostMapping("create")
    public Result create(@RequestBody Send send){
        int flag = sendService.create(send);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @GetMapping("delete")
    public Result delete(String ids){
        int flag = sendService.delete(ids);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @PostMapping("update")
    public Result update(@RequestBody Send send){
        int flag = sendService.update(send);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @GetMapping("detail")
    public Result detail(Integer id){
        return  Result.ok(sendService.detail(id));
    }

    @PostMapping("query")
    public Map<String,Object> query(@RequestBody  Send send){
        PageInfo<Send> pageInfo = sendService.query(send);
        return Result.ok(pageInfo);
    }

}
