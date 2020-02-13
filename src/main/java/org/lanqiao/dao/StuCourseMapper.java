package org.lanqiao.dao;

import org.lanqiao.bean.StuCourse;

import java.util.List;

public interface StuCourseMapper {
    int deleteByPrimaryKey(Integer courseId);

    int insert(StuCourse record);

    int insertSelective(StuCourse record);

    StuCourse selectByPrimaryKey(Integer courseId);

    int updateByPrimaryKeySelective(StuCourse record);

    int updateByPrimaryKey(StuCourse record);

    List<StuCourse> selectAllCourse();
}