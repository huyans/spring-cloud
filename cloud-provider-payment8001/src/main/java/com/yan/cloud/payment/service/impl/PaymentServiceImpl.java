package com.yan.cloud.payment.service.impl;

import com.yan.cloud.entity.Payment;
import com.yan.cloud.payment.dao.PaymentDao;
import com.yan.cloud.payment.service.PaymentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by huyan on 2020/11/30.
 * TIME: 19:55
 * DESC:
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    @Transactional
    public int savePayment(Payment payment) {
        return paymentDao.save(payment);
    }

    @Override
    public Payment getById(Long paymentId) {
        return paymentDao.getById(paymentId);
    }
}
