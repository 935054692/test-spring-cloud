package com.weiy.hello.spring.cloud.web.feign.filter;

import com.weiy.hello.spring.cloud.web.feign.hystrix.WebServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "hello-spring-cloud-service",fallback = WebServiceHystrix.class)
public interface WebService {

    @GetMapping("/hi")
    public String hi(@RequestParam(value = "message") String message);
}
