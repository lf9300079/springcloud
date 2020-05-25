package com.eshore.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author eshore
 * @Date 4/12/2019
 */
@RestController
public class ProviderController {

    @RequestMapping("/provider/hello")
    public String hello() {
        //业务逻辑处理
        return "hello spring cloud 2131";
    }

}
