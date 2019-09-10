package com.alicyu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Alicyu
 * @classname DeptProvider8002_App
 * @description TODO
 * @date 2019/9/4 20:32
 */
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient //服务发现
public class DeptProvider8002_App {
    public static void main(String[] args){
        SpringApplication.run(DeptProvider8002_App.class, args);
    }
}
