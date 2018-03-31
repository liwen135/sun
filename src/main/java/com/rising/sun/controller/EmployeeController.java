package com.rising.sun.controller;

import com.rising.sun.domain.Employee;
import com.rising.sun.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller("/employee")
public class EmployeeController {
    private EmployeeService employeeService;

    @RequestMapping("/get")
    public Object index() {
        Map map = new HashMap();
        map.put("username", "张三");
        return map;
    }

    @RequestMapping("/getEmployee")
    public Employee getEmployee(int id) {
        return employeeService.getEmployee(id);
    }
}
