package com.guoyong.springcloud.service;

import com.guoyong.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService
{
    public int create(Payment payment);
    public Payment getPaymentById(@Param ("id") Long id);
}
