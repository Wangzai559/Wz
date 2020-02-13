package org.lanqiao.dao;

import org.lanqiao.bean.StuGrade;


import java.util.List;

public interface StuGradeMapper {
    int deleteByPrimaryKey(Integer judgeResId);

    int insert(StuGrade record);

    int insertSelective(StuGrade record);

    List<StuGrade> selectAllGrade();
}