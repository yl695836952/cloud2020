package com.yl.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yanglin
 * @version V1.0
 * @Package com.yl.springcloud.config
 * @date 2020/8/19 20:47
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel() {
        return  Logger.Level.FULL;
    }
}
