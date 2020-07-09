package com.guoyong.springcloud.service.impl;

import com.guoyong.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * @author guoyong
 * @date 2020/6/26 - 23:24
 */
@Component
public class PaymentHystrixServiceImpl implements PaymentHystrixService
{

    @Override
    public String paymentInfo_OK(Integer id)
    {
        return "----PaymentHystrixServiceImpl fall back-paymentInfo_OK,/(ㄒoㄒ)/~~";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id)
    {
        return "----PaymentHystrixServiceImpl fall back-paymentInfo_TimeOut,/(ㄒoㄒ)/~~";
    }
}
