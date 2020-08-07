package com.yl.springcloud.dao;

import com.yl.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author yanglin
 * @version V1.0
 * @Package com.yl.springcloud.dao
 * @date 2020/8/6 23:12
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
