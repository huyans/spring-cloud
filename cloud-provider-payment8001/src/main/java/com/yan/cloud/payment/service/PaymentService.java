package com.yan.cloud.payment.service;

import com.yan.cloud.payment.entity.Payment;

/**
 * Created by huyan on 2020/11/30.
 * TIME: 19:55
 * DESC:
 */
public interface PaymentService {

    int savePayment(Payment payment);

    Payment getById(Long paymentId);
}
