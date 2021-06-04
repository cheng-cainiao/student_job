package com.chengcainiao.controller;

import com.chengcainiao.service.ArticleService;
import com.github.pagehelper.PageInfo;
import com.chengcainiao.entity.Article;
import com.chengcainiao.service.ArticleService;
import com.chengcainiao.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PostMapping("create")
    public Result create(@RequestBody Article article){
        int flag = articleService.create(article);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @GetMapping("delete")
    public Result delete(String ids){
        int flag = articleService.delete(ids);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @PostMapping("update")
    public Result update(@RequestBody Article article){
        int flag = articleService.update(article);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @GetMapping("detail")
    public Result detail(Integer id){
        return  Result.ok(articleService.detail(id));
    }

    @PostMapping("query")
    public Map<String,Object> query(@RequestBody  Article article){
        PageInfo<Article> pageInfo = articleService.query(article);
        return Result.ok(pageInfo);
    }

}
