package com.rising.sun.service.impl;

import com.rising.sun.dao.testDao.EmployeeDao;
import com.rising.sun.domain.Employee;
import com.rising.sun.service.EmployeeService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.rising.sun.service"})
public class EmployeeServiceImpl implements EmployeeService {
    @Resource
    private EmployeeDao employeeDao;

    @Override
    public Employee getEmployee(int id) {
//        return new Employee(1, "小明", 13);
        return employeeDao.getEmployee(id);
    }

    @Override
    public int inserEmployee(String username, int age, String password) {
        return employeeDao.insert(username, age, password);
    }


}
