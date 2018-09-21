package com.learn.springcloudeurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * @Author :lwy
 * @Date : 2018/9/21 17:00
 * @Description :
 */
@RestController
public class HelloController {

    private final Logger logger = Logger.getLogger(HelloController.class.getName());
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/one")
    public String getOne() {
        logger.info("the service is: " + discoveryClient.getServices());
        return "hello,world";
    }
}
