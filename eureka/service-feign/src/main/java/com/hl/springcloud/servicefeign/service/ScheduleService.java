package com.hl.springcloud.servicefeign.service;

import com.hl.springcloud.servicefeign.service.impl.ScheduleServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author 黄龙
 * @Date 2019/10/12 16:14
 * @Description TODO
 * @Version 1.0.0
 */
@FeignClient(value = "service-hi", fallback = ScheduleServiceHystrix.class)
public interface ScheduleService {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    String sayHiFromClient(@RequestParam(value = "name", defaultValue = "") String name);
}
