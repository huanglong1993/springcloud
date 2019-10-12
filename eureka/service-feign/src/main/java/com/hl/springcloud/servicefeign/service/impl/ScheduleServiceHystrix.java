package com.hl.springcloud.servicefeign.service.impl;

import com.hl.springcloud.servicefeign.service.ScheduleService;
import org.springframework.stereotype.Component;

/**
 * @Author 黄龙
 * @Date 2019/10/12 17:08
 * @Description TODO
 * @Version 1.0.0
 */
@Component
public class ScheduleServiceHystrix implements ScheduleService {

    @Override
    public String sayHiFromClient(String name) {
        return "sorry " + name + ", the service is error!";
    }
}
