package com.rising.sun.domain;

import java.io.Serializable;
import java.util.Date;

public class Param implements Serializable {

    private Integer id;

    private String createUser;

    private String updateUser;

    private Date createTime;

    private Date updateTime;

    private Integer version;

    private Date ts;

    private Integer isDelete;

    public Param() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "Param{" +
                "id=" + id +
                ", createUser='" + createUser + '\'' +
                ", updateUser='" + updateUser + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", version=" + version +
                ", ts=" + ts +
                ", isDelete=" + isDelete +
                '}';
    }
}
