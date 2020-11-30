package com.yan.cloud.payment.service.impl;

import com.yan.cloud.payment.dao.PaymentDao;
import com.yan.cloud.payment.entity.Payment;
import com.yan.cloud.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by huyan on 2020/11/30.
 * TIME: 19:55
 * DESC:
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
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
