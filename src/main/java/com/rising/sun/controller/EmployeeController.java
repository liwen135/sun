package com.rising.sun.controller;

import com.rising.sun.domain.Employee;
import com.rising.sun.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/employee")
@ComponentScan(basePackages = {"com.rising.sun.service"})
@EnableAutoConfiguration
public class EmployeeController {
    private final Logger log = LoggerFactory.getLogger(EmployeeController.class);
    @Resource
    private EmployeeService employeeService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    @ResponseBody
    public String hello() {
        return "hello world!";
    }


    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public Object index() {
        Map map = new HashMap();
        map.put("username", "张三");
        return map;
    }

    @RequestMapping(value = "/getEmployee", method = RequestMethod.GET)
    @ResponseBody
    public Employee getEmployee(@RequestParam("id") int id) {
        log.info("查询员工信息！");
        return employeeService.getEmployee(id);
    }


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @ResponseBody
    String add() {
        employeeService.inserEmployee("username123寇鑫", 20, "password123寇鑫");
        return "插入成功";
    }
}
