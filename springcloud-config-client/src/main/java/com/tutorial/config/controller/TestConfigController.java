package com.tutorial.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConfigController {

    @Value("${foo}")
    private String foo;

    @RequestMapping(value = "/foo", method = RequestMethod.GET)
    public String foo() {
        return foo;
    }

}
