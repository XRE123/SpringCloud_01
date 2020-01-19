package com.mxy.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ：mmzs
 * @date ：Created in 2020/1/17 10:47
 * @description：
 * @modified By：
 * @version: $
 */
@EnableEurekaClient
@MapperScan("com.mxy.springcloud.mapper")
@SpringBootApplication
public class ProductProvider_8002 {
    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_8002.class, args);
    }
}
