package com.hl.springcloud.ribbonserver.controller;

import com.hl.springcloud.ribbonserver.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 黄龙
 * @Date 2019/10/12 15:47
 * @Description TODO
 * @Version 1.0.0
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/hi")
    public String hi(String name){
        return helloService.hiService(name);
    }

}
