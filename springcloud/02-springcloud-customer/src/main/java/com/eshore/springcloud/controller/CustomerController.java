package com.eshore.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @Author eshore
 * @Date 4/12/2019
 */
@RestController
public class CustomerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/customer/hello")
    public String hello() {
//        业务逻辑处理

//        调用springcloud服务提供者提供的服务
//        return restTemplate.getForEntity("http://localhost:8080/provider/hello" , String.class).getBody();
        return restTemplate.getForEntity("http://01-SPRINGCLOUD-PROVIDER/provider/hello" , String.class).getBody();

    }

}
