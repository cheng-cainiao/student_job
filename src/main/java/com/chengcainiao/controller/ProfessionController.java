package com.chengcainiao.controller;

import com.github.pagehelper.PageInfo;
import com.chengcainiao.entity.Profession;
import com.chengcainiao.service.ProfessionService;
import com.chengcainiao.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/profession")
public class ProfessionController {

    @Autowired
    private ProfessionService professionService;

    @PostMapping("create")
    public Result create(@RequestBody Profession profession){
        int flag = professionService.create(profession);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @GetMapping("delete")
    public Result delete(String ids){
        int flag = professionService.delete(ids);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @PostMapping("update")
    public Result update(@RequestBody Profession profession){
        int flag = professionService.update(profession);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @GetMapping("detail")
    public Result detail(Integer id){
        return  Result.ok(professionService.detail(id));
    }

    @PostMapping("query")
    public Map<String,Object> query(@RequestBody  Profession profession){
        PageInfo<Profession> pageInfo = professionService.query(profession);
        return Result.ok(pageInfo);
    }

}
