package com.rising.sun.controller;

import com.rising.sun.domain.DeptMent;
import com.rising.sun.service.DeptmentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@Api(tags = "DeptmentController", description = "部门管理")
@RequestMapping("/deptment")
public class DeptmentController {
    @Resource
    private DeptmentService deptmentService;

    @ResponseBody
    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ApiOperation("获取所有部门")
    public List<DeptMent> getAllDeptment() {
        List<DeptMent> deptmentList = deptmentService.getDeptmentList();
        return deptmentList;
    }
}
