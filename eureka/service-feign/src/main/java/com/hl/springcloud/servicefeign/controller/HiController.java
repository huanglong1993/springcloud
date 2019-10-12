package com.hl.springcloud.servicefeign.controller;

import com.hl.springcloud.servicefeign.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 黄龙
 * @Date 2019/10/12 16:19
 * @Description TODO
 * @Version 1.0.0
 */
@RestController
public class HiController {

    @Autowired
    ScheduleService scheduleService;

    @RequestMapping("/sayHi")
    public String sayHi(String name){
        return scheduleService.sayHiFromClient(name);
    }
}
