package com.chengcainiao.controller;

import com.github.pagehelper.PageInfo;
import com.chengcainiao.entity.Favor;
import com.chengcainiao.service.FavorService;
import com.chengcainiao.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/favor")
public class FavorController {

    @Autowired
    private FavorService favorService;

    @PostMapping("create")
    public Result create(@RequestBody Favor favor){
        int flag = favorService.create(favor);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @GetMapping("delete")
    public Result delete(String ids){
        int flag = favorService.delete(ids);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @PostMapping("update")
    public Result update(@RequestBody Favor favor){
        int flag = favorService.update(favor);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @GetMapping("detail")
    public Result detail(Integer id){
        return  Result.ok(favorService.detail(id));
    }

    @PostMapping("query")
    public Map<String,Object> query(@RequestBody  Favor favor){
        PageInfo<Favor> pageInfo = favorService.query(favor);
        return Result.ok(pageInfo);
    }

}
