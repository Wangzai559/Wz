package org.lanqiao.service.impl;

import org.lanqiao.bean.StuClass;
import org.lanqiao.dao.StuClassMapper;
import org.lanqiao.service.IStuClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName SSMProject
 * @Package org.lanqiao.service.impl
 * @Date 2020/2/3 11:03
 * @Author pw
 */

@Service
public class StuClassServiceImpl implements IStuClassService {

    @Autowired
    private StuClassMapper stuClassMapper;

    @Override
    public int deleteByPrimaryKey(Integer classId) {
        return stuClassMapper.deleteByPrimaryKey(classId);
    }

    @Override
    public int insert(StuClass record) {
        return stuClassMapper.insert(record);
    }

    @Override
    public int insertSelective(StuClass record) {
        return stuClassMapper.insertSelective(record);
    }

    @Override
    public StuClass selectByPrimaryKey(Integer classId) {
        return stuClassMapper.selectByPrimaryKey(classId);
    }

    @Override
    public int updateByPrimaryKeySelective(StuClass record) { return stuClassMapper.updateByPrimaryKeySelective(record); }

    @Override
    public int updateByPrimaryKey(StuClass record) {
        return stuClassMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<StuClass> selectAllClass() {
        return stuClassMapper.selectAllClass();
    }
}
