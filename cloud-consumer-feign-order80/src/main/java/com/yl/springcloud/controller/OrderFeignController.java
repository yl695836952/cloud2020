package com.yl.springcloud.controller;

import com.yl.springcloud.entities.CommonResult;
import com.yl.springcloud.entities.Payment;
import com.yl.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yanglin
 * @version V1.0
 * @Package com.yl.springcloud.controller
 * @date 2020/8/19 20:48
 */
@RestController
@Slf4j
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value="/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id")  Long id) {
        return  paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout() {
        //openfeign-ribbon     客户端默认等待1S
        return  paymentFeignService.paymentFeignTimeout();
    }
}
