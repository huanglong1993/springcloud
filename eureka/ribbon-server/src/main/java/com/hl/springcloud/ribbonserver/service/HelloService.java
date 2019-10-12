package com.hl.springcloud.ribbonserver.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author 黄龙
 * @Date 2019/10/12 15:46
 * @Description TODO
 * @Version 1.0.0
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name){
        return restTemplate.getForObject("http://SERVICE-HI/home?name="+name, String.class);
    }

    public String hiError(String name){
        return "sorry, "+name+" the service is error";
    }
}
