package com.rising.sun.service.impl;

import com.rising.sun.dao.testDao.DeptmentDao;
import com.rising.sun.domain.DeptMent;
import com.rising.sun.service.DeptmentService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@EnableAutoConfiguration
public class DeptmentServiceImpl implements DeptmentService {
    @Resource
    private DeptmentDao deptmentDao;

    @Override
    public List<DeptMent> getDeptmentList() {
        return deptmentDao.selectAll();
    }
}
