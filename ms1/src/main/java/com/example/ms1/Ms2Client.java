package com.example.ms1;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient("http://microservice-2")
public  interface Ms2Client {

    @GetMapping("/greet/{who}")
    @ResponseBody
    String hello(@PathVariable("who") String who);
}
