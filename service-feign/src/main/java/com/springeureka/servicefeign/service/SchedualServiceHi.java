package com.springeureka.servicefeign.service;

import com.springeureka.servicefeign.service.impl.SchudualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * springCloud-feign服务消费者
 * 通过 @FeignClient("服务名xxx") 声明具体的服务提供者xxx
 *
 * fallback 对应熔断措施的类 指定的类
 *
 * @author lnb
 * @date 2019年5月9日16:38:51
 */
@FeignClient(value = "service-hi",fallback = SchudualServiceHiHystric.class)
public interface SchedualServiceHi {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromFeignClientOne(@RequestParam(value = "name") String name);



}
