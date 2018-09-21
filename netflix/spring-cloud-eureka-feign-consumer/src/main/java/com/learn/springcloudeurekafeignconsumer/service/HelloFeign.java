package com.learn.springcloudeurekafeignconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author :lwy
 * @Date : 2018/9/21 17:19
 * @Description :
 */
@FeignClient(value = "eureka-client")
public interface HelloFeign {

    @RequestMapping(value = "/one", method = RequestMethod.GET)
    String getOne();
}
