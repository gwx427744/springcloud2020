package com.guoyong.springcloud.controller;

import com.guoyong.springcloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author guoyong
 * @date 2020/6/26 - 10:25
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "payment_Golbal_FallbackMethod")  //hystrix全局兜底方法配置
public class OrderHystrixController
{
    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping(value = "/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id)
    {
        return paymentHystrixService.paymentInfo_OK(id);
    }

    @GetMapping(value = "/consumer/payment/hystrix/timeout/{id}")
    //hystrix私有兜底方法配置
//    @HystrixCommand(fallbackMethod = "payment_TimeOutFallbackMethod",commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1500")
//    })
    //hystrix全局兜底方法配置
    @HystrixCommand
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id)
    {
        int age = 10/0;
        return paymentHystrixService.paymentInfo_TimeOut(id);
    }

    public String payment_TimeOutFallbackMethod(@PathVariable Integer id)
    {
        return "我是消费者80，对方支付系统繁忙或者自己运行错误，请10秒钟后再试，/(ㄒoㄒ)/~~";
    }

    public String payment_Golbal_FallbackMethod()
    {
        return "Global异常处理信息，请稍后重试，/(ㄒoㄒ)/~~";
    }
}
