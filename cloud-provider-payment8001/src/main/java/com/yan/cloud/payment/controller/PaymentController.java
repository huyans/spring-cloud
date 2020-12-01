package com.yan.cloud.payment.controller;

import com.yan.cloud.common.CommonResult;
import com.yan.cloud.entity.Payment;
import com.yan.cloud.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by huyan on 2020/11/30.
 * TIME: 19:57
 * DESC:
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/create")
    public CommonResult createPayment(@RequestBody Payment payment) {
        int result = paymentService.savePayment(payment);
        if (result > 0) {
            return new CommonResult(200, "success");
        }else {
            return new CommonResult(400, "can not save payment");
        }
    }

    @GetMapping("/get/{id}")
    public CommonResult createPayment(@PathVariable("id")Long paymentId) {
        Payment payment = paymentService.getById(paymentId);
        return new CommonResult(200, "success", payment);
    }
}
