package com.chengcainiao.controller;

import com.github.pagehelper.PageInfo;
import com.chengcainiao.entity.Experience;
import com.chengcainiao.service.ExperienceService;
import com.chengcainiao.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/experience")
public class ExperienceController {

    @Autowired
    private ExperienceService experienceService;

    @PostMapping("create")
    public Result create(@RequestBody Experience experience){
        int flag = experienceService.create(experience);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @GetMapping("delete")
    public Result delete(String ids){
        int flag = experienceService.delete(ids);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @PostMapping("update")
    public Result update(@RequestBody Experience experience){
        int flag = experienceService.update(experience);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @GetMapping("detail")
    public Result detail(Integer id){
        return  Result.ok(experienceService.detail(id));
    }

    @PostMapping("query")
    public Map<String,Object> query(@RequestBody  Experience experience){
        PageInfo<Experience> pageInfo = experienceService.query(experience);
        return Result.ok(pageInfo);
    }

}
