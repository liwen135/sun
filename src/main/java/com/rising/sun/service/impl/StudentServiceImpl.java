package com.rising.sun.service.impl;

import com.rising.sun.dao.testDao.StudentDao;
import com.rising.sun.domain.Student;
import com.rising.sun.service.StudentService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@EnableAutoConfiguration
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;

    @Override
    public Student getStudent(Long id) {
        return studentDao.selectStudentById(id);
    }
}
