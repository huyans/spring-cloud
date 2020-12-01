package com.yan.cloud.payment.dao;

import com.yan.cloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by huyan on 2020/11/30.
 * TIME: 19:48
 * DESC:
 */
@Mapper
public interface PaymentDao {

    int save(Payment payment);

    Payment getById(Long paymentId);


}
