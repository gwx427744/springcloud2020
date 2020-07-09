package com.guoyong.springcloud.controller;

import com.guoyong.springcloud.entity.CommonResult;
import com.guoyong.springcloud.entity.Payment;
import com.guoyong.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author guoyong
 * @date 2020/6/18 - 23:44
 */
@RestController
@Slf4j
public class OrderFeignController
{
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id)
    {
        return paymentFeignService.getPaymentById (id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentTimeout()
    {
        //openfeign-ribbon,客户端默认等待1秒钟
        return paymentFeignService.paymentTimeout();
    }
}
