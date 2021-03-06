package com.yl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author yanglin
 * @version V1.0
 * @Package com.yl.springcloud
 * @date 2020/9/12 20:56
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3355 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain3355.class,args);
    }
}
