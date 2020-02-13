package org.lanqiao.service;

import org.lanqiao.bean.StuCourse;

import java.util.List;

/**
 * @ProjectName SSMProject
 * @Package org.lanqiao.service
 * @Date 2020/2/3 9:57
 * @Author pw
 */
public interface IStuCourseService {
    int deleteByPrimaryKey(Integer courseId);

    int insert(StuCourse record);

    int insertSelective(StuCourse record);

    StuCourse selectByPrimaryKey(Integer courseId);

    int updateByPrimaryKeySelective(StuCourse record);

    int updateByPrimaryKey(StuCourse record);

    List<StuCourse> selectAllCourse();
}
