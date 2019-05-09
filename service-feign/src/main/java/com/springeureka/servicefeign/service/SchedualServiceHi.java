package com.springeureka.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * springCloud-feign服务消费者
 * 通过 @FeignClient("服务名xxx") 声明具体的服务提供者xxx
 * @author lnb
 * @date 2019年5月9日16:38:51
 */
@FeignClient("service-hi")
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromFeignClientOne(@RequestParam(value = "name") String name);

}
