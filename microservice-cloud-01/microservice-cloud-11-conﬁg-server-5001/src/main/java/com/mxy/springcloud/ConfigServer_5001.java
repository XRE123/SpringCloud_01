package com.mxy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import javax.swing.*;

/**
 * @author ：mmzs
 * @date ：Created in 2020/1/20 15:40
 * @description：
 * @modified By：
 * @version: $
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServer_5001 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer_5001.class, args);
    }
}
