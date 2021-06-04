package com.chengcainiao.controller;

import com.github.pagehelper.PageInfo;
import com.chengcainiao.entity.Train;
import com.chengcainiao.service.TrainService;
import com.chengcainiao.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/train")
public class TrainController {

    @Autowired
    private TrainService trainService;

    @PostMapping("create")
    public Result create(@RequestBody Train train){
        int flag = trainService.create(train);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @GetMapping("delete")
    public Result delete(String ids){
        int flag = trainService.delete(ids);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @PostMapping("update")
    public Result update(@RequestBody Train train){
        int flag = trainService.update(train);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @GetMapping("detail")
    public Result detail(Integer id){
        return  Result.ok(trainService.detail(id));
    }

    @PostMapping("query")
    public Map<String,Object> query(@RequestBody  Train train){
        PageInfo<Train> pageInfo = trainService.query(train);
        return Result.ok(pageInfo);
    }

}
