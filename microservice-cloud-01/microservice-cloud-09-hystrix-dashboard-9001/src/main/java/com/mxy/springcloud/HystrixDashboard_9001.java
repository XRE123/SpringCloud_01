package com.mxy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author ：mmzs
 * @date ：Created in 2020/1/19 16:35
 * @description：
 * @modified By：
 * @version: $
 */
@EnableHystrixDashboard
@SpringBootApplication
public class HystrixDashboard_9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboard_9001.class, args);
    }
}
