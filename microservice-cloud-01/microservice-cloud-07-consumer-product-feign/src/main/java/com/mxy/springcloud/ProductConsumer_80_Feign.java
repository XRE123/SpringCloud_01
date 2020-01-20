package com.mxy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ：mmzs
 * @date ：Created in 2020/1/17 14:48
 * @description：
 * @modified By：
 * @version: $
 */
@EnableFeignClients(basePackages = "com.mxy.springcloud.service")
@EnableEurekaClient
@SpringBootApplication
public class ProductConsumer_80_Feign {
    public static void main(String[] args){
        SpringApplication.run(ProductConsumer_80_Feign.class, args);
    }
}
