package com.guoyong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author guoyong
 * @date 2020/6/22 - 0:23
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderHystrixMain80
{
    public static void main(String[] args) {
        SpringApplication.run (OrderHystrixMain80.class,args);
    }
}
