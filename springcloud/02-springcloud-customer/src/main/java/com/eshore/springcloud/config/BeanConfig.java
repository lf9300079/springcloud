package com.eshore.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author eshore
 * @Date 4/12/2019
 */
@Configuration // 等价于xml文件
public class BeanConfig {

    /**
     * 相当于在xml中配置了一个
     * <bean id = "" class = "" >
     * </bean>
     * @return
     */
    @LoadBalanced //ribbon负载均衡
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
