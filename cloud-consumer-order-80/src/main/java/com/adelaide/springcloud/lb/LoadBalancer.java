package com.adelaide.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

public interface LoadBalancer {
    ServiceInstance getInstance(List<ServiceInstance> serviceInstanceList);
}
