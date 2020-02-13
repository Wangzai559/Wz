package org.lanqiao.dao;

import org.lanqiao.bean.StuClass;

import java.util.List;

public interface StuClassMapper {
    int deleteByPrimaryKey(Integer classId);

    int insert(StuClass record);

    int insertSelective(StuClass record);

    StuClass selectByPrimaryKey(Integer classId);

    int updateByPrimaryKeySelective(StuClass record);

    int updateByPrimaryKey(StuClass record);

    List<StuClass> selectAllClass();
}