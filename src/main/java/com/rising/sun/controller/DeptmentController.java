package com.rising.sun.controller;

import com.rising.sun.domain.DeptMent;
import com.rising.sun.service.DeptmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/deptment")
public class DeptmentController {
    @Resource
    private DeptmentService deptmentService;

    @ResponseBody
    @RequestMapping("/getAll")
    public List<DeptMent> getAllDeptment() {
        List<DeptMent> deptmentList = deptmentService.getDeptmentList();
        return deptmentList;
    }
}
