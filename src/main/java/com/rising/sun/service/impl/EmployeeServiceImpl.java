package com.rising.sun.service.impl;

import com.rising.sun.dao.employeeDao.EmployeeDao;
import com.rising.sun.domain.Employee;
import com.rising.sun.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Resource
    private EmployeeDao employeeDao;

    @Override
    public Employee getEmployee(int id) {
        return employeeDao.getEmployee(id);
    }
}
