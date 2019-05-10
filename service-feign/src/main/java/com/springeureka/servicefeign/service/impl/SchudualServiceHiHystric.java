package com.springeureka.servicefeign.service.impl;

import com.springeureka.servicefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * 作为熔断返回的信息   @Component 注入Bean
 * @author lnb
 * @date 2019年5月10日11:06:46
 */
@Component
public class SchudualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromFeignClientOne(String name) {
        return "sorry"+name;
    }
}
