package com.rising.sun.dao.employeeDao;

import com.rising.sun.domain.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmployeeDao {

    @Select("SELECT * FROM t_employee WHERE id = #{id}")
    Employee getEmployee(@Param("id") int id);

    @Insert("INSERT INTO t_employee(username, age,password) VALUES(#{username}, #{age},#{password})")
    int insert(@Param("username") String name, @Param("age") int age, @Param("password") String password);
}
