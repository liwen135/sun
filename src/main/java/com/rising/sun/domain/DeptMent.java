package com.rising.sun.domain;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "t_deptment")
public class DeptMent {

    @Column(name = "id")
    private Integer id;

    @Column(name = "deptName")
    private String deptName;

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
