package com.yl.springcloud.service.impl;

import com.yl.springcloud.dao.PaymentDao;
import com.yl.springcloud.entities.Payment;
import com.yl.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yanglin
 * @version V1.0
 * @Package com.yl.springcloud.service.impl
 * @date 2020/8/6 23:10
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
