package com.tutorial.feign.service;

import org.springframework.stereotype.Component;

@Component
public class AdminServiceHystrix implements AdminService{
    @Override
    public String sayHi(String message) {
        return "error";
    }
}
