package com.alicyu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Alicyu
 * @classname DeptConsumer80_App
 * @description TODO
 * @date 2019/9/4 20:40
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.alicyu.springcloud"})
@ComponentScan("com.alicyu.springcloud")
public class DeptConsumer80_Feign_App {
    public static void main(String[] args){
        SpringApplication.run(DeptConsumer80_Feign_App.class, args);
    }

}
