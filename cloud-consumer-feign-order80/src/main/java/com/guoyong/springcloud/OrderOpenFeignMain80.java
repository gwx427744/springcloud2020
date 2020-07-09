package com.guoyong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author guoyong
 * @date 2020/6/18 - 23:31
 */
@SpringBootApplication
@EnableFeignClients     //使用Feign,激活并开启
public class OrderOpenFeignMain80
{
    public static void main(String[] args) {
        SpringApplication.run(OrderOpenFeignMain80.class,args);
    }
}
