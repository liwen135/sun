package com.rising.sun.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.rising.sun.service"})
public class TestBaseController {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "hello world";
    }


}
