package com.alicyu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Alicyu
 * @classname Config_Git_EurekaServerApplication
 * @description TODO
 * @date 2019/9/6 16:53
 */
@SpringBootApplication
@EnableEurekaServer
public class Config_Git_EurekaServerApplication7001 {
    public static void main(String[] args) {
        SpringApplication.run(Config_Git_EurekaServerApplication7001.class,args);
    }
}
