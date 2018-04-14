package com.rising.sun.controller;

import com.rising.sun.domain.Student;
import com.rising.sun.service.StudentService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.persistence.Id;

@Controller
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.rising.sun.service"})
public class TestBaseController {
    @Resource
    private StudentService studentService;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "hello world";
    }

    @RequestMapping("/getStudent")
    @ResponseBody
    public Student getStudent(@RequestParam("id") Long id) {
        return studentService.getStudent(id);
    }


}
