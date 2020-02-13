package org.lanqiao.dao;

import org.lanqiao.bean.StuMajor;

import java.util.List;

public interface StuMajorMapper {
    int deleteByPrimaryKey(Integer majorId);

    int insert(StuMajor record);

    int insertSelective(StuMajor record);

    StuMajor selectByPrimaryKey(Integer majorId);

    int updateByPrimaryKeySelective(StuMajor record);

    int updateByPrimaryKey(StuMajor record);

    List<StuMajor> selectAllMajor();
}