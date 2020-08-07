package com.yl.springcloud.service;

import com.yl.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author yanglin
 * @version V1.0
 * @Package com.yl.springcloud.service
 * @date 2020/8/6 23:10
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
