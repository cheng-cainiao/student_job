package com.chengcainiao.controller;

import com.github.pagehelper.PageInfo;
import com.chengcainiao.entity.Certificate;
import com.chengcainiao.service.CertificateService;
import com.chengcainiao.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/certificate")
public class CertificateController {

    @Autowired
    private CertificateService certificateService;

    @PostMapping("create")
    public Result create(@RequestBody Certificate certificate){
        int flag = certificateService.create(certificate);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @GetMapping("delete")
    public Result delete(String ids){
        int flag = certificateService.delete(ids);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @PostMapping("update")
    public Result update(@RequestBody Certificate certificate){
        int flag = certificateService.update(certificate);
        if(flag>0){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @GetMapping("detail")
    public Result detail(Integer id){
        return  Result.ok(certificateService.detail(id));
    }

    @PostMapping("query")
    public Map<String,Object> query(@RequestBody  Certificate certificate){
        PageInfo<Certificate> pageInfo = certificateService.query(certificate);
        return Result.ok(pageInfo);
    }

}
