package com.mxy.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author ：mmzs
 * @date ：Created in 2020/1/17 10:47
 * @description：
 * @modified By：
 * @version: $
 */
@EnableHystrix //开启Hystrix熔断机制
@EnableEurekaClient
@MapperScan("com.mxy.springcloud.mapper")
@SpringBootApplication
public class ProductProvider_8001_hystrix {
    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_8001_hystrix.class, args);
    }
}
