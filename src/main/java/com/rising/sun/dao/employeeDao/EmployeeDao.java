package com.rising.sun.dao.employeeDao;

import com.rising.sun.domain.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeDao  {

    Employee getEmployee(int id);

}
