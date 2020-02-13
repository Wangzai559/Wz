package org.lanqiao.service.impl;

import org.lanqiao.bean.StuGrade;
import org.lanqiao.dao.StuGradeMapper;
import org.lanqiao.service.IStuGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName SSMProject
 * @Package org.lanqiao.service.impl
 * @Date 2020/2/3 10:57
 * @Author pw
 */

@Service
public class StuGradeServiceImpl implements IStuGradeService {

    @Autowired
    private StuGradeMapper stuGradeMapper;
    @Override
    public int deleteByPrimaryKey(Integer judgeResId) {
        return stuGradeMapper.deleteByPrimaryKey(judgeResId);
    }

    @Override
    public int insert(StuGrade record) {
        return stuGradeMapper.insert(record);
    }

    @Override
    public int insertSelective(StuGrade record) {
        return stuGradeMapper.insertSelective(record);
    }

    @Override
    public List<StuGrade> selectAllGrade() {
        return stuGradeMapper.selectAllGrade();
    }
}
