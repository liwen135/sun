package com.rising.sun.service;

import com.rising.sun.domain.Employee;

public interface EmployeeService {

    Employee getEmployee(int id);

    int inserEmployee(String username, int age, String password);
}
