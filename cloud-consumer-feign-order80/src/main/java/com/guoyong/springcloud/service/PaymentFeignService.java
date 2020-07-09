package com.guoyong.springcloud.service;

import com.guoyong.springcloud.entity.CommonResult;
import com.guoyong.springcloud.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author guoyong
 * @date 2020/6/18 - 23:37
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")  //使用OpenFeign
public interface PaymentFeignService
{
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentTimeout();
}
