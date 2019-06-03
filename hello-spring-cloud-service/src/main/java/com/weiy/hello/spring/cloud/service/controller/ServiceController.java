package com.weiy.hello.spring.cloud.service.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hi")
    public String hi(String message){
        return "this is the message : "+message+" : "+port;
    }

}
