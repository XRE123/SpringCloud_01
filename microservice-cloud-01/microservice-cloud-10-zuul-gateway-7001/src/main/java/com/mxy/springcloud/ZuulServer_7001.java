package com.mxy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


/**
 * @author ：mmzs
 * @date ：Created in 2020/1/19 17:49
 * @description：
 * @modified By：
 * @version: $
 */
@EnableZuulProxy//开启zuul功能
@SpringBootApplication
public class ZuulServer_7001 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServer_7001.class, args);
    }
}
