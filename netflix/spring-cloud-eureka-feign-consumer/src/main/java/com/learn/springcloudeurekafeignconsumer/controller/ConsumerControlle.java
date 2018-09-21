package com.learn.springcloudeurekafeignconsumer.controller;

import com.learn.springcloudeurekafeignconsumer.service.HelloFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author :lwy
 * @Date : 2018/9/21 17:17
 * @Description :
 */
@RestController
public class ConsumerControlle {


    @Resource
    private HelloFeign helloFeign;

    @GetMapping("/one")
    public String getOne(){
        return helloFeign.getOne();
    }
}
