package com.yan.cloud.controller;

import com.yan.cloud.common.CommonResult;
import com.yan.cloud.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * Created by huyan on 2020/12/1.
 * TIME: 9:22
 * DESC:
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    public static final String PAYMENT_URL = "http://localhost:8001/payment";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult createPayment(Payment payment) {
        ResponseEntity<CommonResult> entity = restTemplate.postForEntity(PAYMENT_URL + "/create", payment, CommonResult.class);
        return entity.getBody();
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long paymentId) {
        ResponseEntity<CommonResult> entity = restTemplate.getForEntity(PAYMENT_URL + "/get/" + paymentId, CommonResult.class);
        return entity.getBody();
    }
}
