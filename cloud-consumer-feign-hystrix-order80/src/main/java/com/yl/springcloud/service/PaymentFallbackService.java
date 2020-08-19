package com.yl.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author yanglin
 * @version V1.0
 * @Package com.yl.springcloud.service
 * @date 2020/8/19 22:35
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService  {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "----PaymentFallbackService fall back paymentInfo_OK,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "----PaymentFallbackService fall back paymentInfo_Timeout,o(╥﹏╥)o";
    }
}
