package com.weiy.hello.spring.cloud.web.feign.controller;


import com.weiy.hello.spring.cloud.web.feign.filter.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebFeignController {

    @Autowired
    private WebService webservice;

    @GetMapping("/hi")
    public String hi(String message){
        return webservice.hi(message);
    }
}
