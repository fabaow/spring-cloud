package com.fbstore.order.controller;

import com.sun.javafx.binding.StringFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
    @Autowired
    RestTemplate restTemplate;
//    @Autowired
//    LoadBalancerClient loadBalancerClient;

//    @RequestMapping("/new/{memberName}")
//    private String newOrder(@PathVariable("memberName") String memberName){
//        ServiceInstance memberServiceInstance=loadBalancerClient.choose("member");
//        String memberBaseUrl= String.format("http://%s:%s/member",memberServiceInstance.getHost(),memberServiceInstance.getPort());
//        RestTemplate restTemplate=new RestTemplate();
//        return restTemplate.getForObject(memberBaseUrl+"/getByName/"+memberName,String.class);
//    }

    @RequestMapping("/new/{memberName}")
    private String newOrder(@PathVariable("memberName") String memberName){
        return "下了订单"+restTemplate.getForObject("http://MEMBER/member/getByName/"+memberName,String.class);
    }
}
