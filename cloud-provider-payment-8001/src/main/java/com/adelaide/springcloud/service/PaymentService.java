package com.adelaide.springcloud.service;

import com.adelaide.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    // Create payment
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
