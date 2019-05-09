package com.springeureka.serviceribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 测试类
 * @author lnb
 * @date 2019年5月8日16:37:39
 */
@Service("HelloService")
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {

        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }
}
