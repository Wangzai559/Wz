package org.lanqiao.service.impl;

import org.lanqiao.bean.StuCourse;
import org.lanqiao.dao.StuCourseMapper;
import org.lanqiao.service.IStuCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName SSMProject
 * @Package org.lanqiao.service.impl
 * @Date 2020/2/3 10:59
 * @Author pw
 */

@Service
public class StuCourseServiceImpl implements IStuCourseService {

    @Autowired
    private StuCourseMapper stuCourseMapper;
    @Override
    public int deleteByPrimaryKey(Integer courseId) {
        return stuCourseMapper.deleteByPrimaryKey(courseId);
    }

    @Override
    public int insert(StuCourse record) {
        return stuCourseMapper.insert(record);
    }

    @Override
    public int insertSelective(StuCourse record) {
        return stuCourseMapper.insertSelective(record);
    }

    @Override
    public StuCourse selectByPrimaryKey(Integer courseId) {
        return stuCourseMapper.selectByPrimaryKey(courseId);
    }

    @Override
    public int updateByPrimaryKeySelective(StuCourse record) {
        return stuCourseMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(StuCourse record) {
        return stuCourseMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<StuCourse> selectAllCourse() {
        return stuCourseMapper.selectAllCourse();
    }
}
