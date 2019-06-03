package com.weiy.hello.spring.cloud.web.feign.hystrix;

import com.weiy.hello.spring.cloud.web.feign.filter.WebService;
import org.springframework.stereotype.Component;

@Component
public class WebServiceHystrix implements WebService {
    @Override
    public String hi(String message) {
        return "feign: service has been stopped !";
    }
}
