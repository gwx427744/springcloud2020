package com.guoyong.springcloud.service;

import com.guoyong.springcloud.entity.Payment;

public interface PaymentService
{
    public int create(Payment payment);
    public Payment getPaymentById(Long id);
}
