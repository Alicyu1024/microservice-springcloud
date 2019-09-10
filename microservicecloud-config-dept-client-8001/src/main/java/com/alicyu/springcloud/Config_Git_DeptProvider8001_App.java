package com.alicyu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Alicyu
 * @classname DeptProvider8001_App
 * @description TODO
 * @date 2019/9/8 10:22
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class Config_Git_DeptProvider8001_App {
    public static void main(String[] args) {
        SpringApplication.run(Config_Git_DeptProvider8001_App.class,args);
    }
}
