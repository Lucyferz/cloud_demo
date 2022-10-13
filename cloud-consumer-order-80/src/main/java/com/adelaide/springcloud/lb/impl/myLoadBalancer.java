package com.adelaide.springcloud.lb.impl;


import com.adelaide.springcloud.lb.LoadBalancer;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class myLoadBalancer implements LoadBalancer {
    @Override
    public ServiceInstance getInstance(List<ServiceInstance> serviceInstanceList) {
        int serviceNum = serviceInstanceList.size();
        int next = new Random().nextInt(serviceNum);
        return serviceInstanceList.get(next);
        // todo: implement own LB algorithm
    }
}
