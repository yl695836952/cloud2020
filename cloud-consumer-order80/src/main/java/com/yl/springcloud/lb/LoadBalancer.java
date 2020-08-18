package com.yl.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author yanglin
 * @version V1.0
 * @Package com.yl.springcloud.lb
 * @date 2020/8/18 21:17
 */
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
