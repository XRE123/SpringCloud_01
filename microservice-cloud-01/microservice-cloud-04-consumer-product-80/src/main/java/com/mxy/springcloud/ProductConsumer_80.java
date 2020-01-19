package com.mxy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ：mmzs
 * @date ：Created in 2020/1/17 14:48
 * @description：
 * @modified By：
 * @version: $
 */
@EnableEurekaClient
@SpringBootApplication
public class ProductConsumer_80 {
    public static void main(String[] args){
        SpringApplication.run(ProductConsumer_80.class, args);
    }
}
