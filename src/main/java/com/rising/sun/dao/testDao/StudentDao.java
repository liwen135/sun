package com.rising.sun.dao.testDao;

import com.rising.sun.dao.baseDao.BaseMapper;
import com.rising.sun.domain.Student;

public interface StudentDao extends BaseMapper<Student> {

    int insert(Student student);

    Student selectStudentById(Long id);

}
