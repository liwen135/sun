package com.rising.sun.dao.testDao;

import com.rising.sun.dao.baseDao.BaseMapper;
import com.rising.sun.domain.DeptMent;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DeptmentDao extends BaseMapper<DeptMent> {

//    @Select("SELECT * FROM t_deptment")
//    List<DeptMent> selectAll();
}
