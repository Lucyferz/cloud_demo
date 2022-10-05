package com.adelaide.springcloud.controller;


import com.adelaide.entities.CommonResult;
import com.adelaide.entities.Payment;
import com.adelaide.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("Insertion result:" + result);

        if (result > 0) {
            return new CommonResult(200, "Success insert data ", result);
        } else {
            return new CommonResult(500, "Failed to insert data");
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("Get Payment:　" + payment);

        if (payment==null) {
            return new CommonResult(500, "Payment record not found，id：　" + id);
        } else {
            return new CommonResult(200, "Payment record founded", payment);
        }
    }
}

