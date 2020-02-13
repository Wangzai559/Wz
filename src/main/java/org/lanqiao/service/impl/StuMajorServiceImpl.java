package org.lanqiao.service.impl;

import org.lanqiao.bean.StuMajor;
import org.lanqiao.dao.StuInfoMapper;
import org.lanqiao.dao.StuMajorMapper;
import org.lanqiao.service.IStuMajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName SSMProject
 * @Package org.lanqiao.service.impl
 * @Date 2020/2/3 10:51
 * @Author pw
 */

@Service
public class StuMajorServiceImpl implements IStuMajorService {

    @Autowired
    private StuMajorMapper stuMajorMapper;

    @Override
    public int deleteByPrimaryKey(Integer majorId) {
        return stuMajorMapper.deleteByPrimaryKey(majorId);
    }

    @Override
    public int insert(StuMajor record) {
        return stuMajorMapper.insert(record);
    }

    @Override
    public int insertSelective(StuMajor record) {
        return stuMajorMapper.insertSelective(record);
    }

    @Override
    public StuMajor selectByPrimaryKey(Integer majorId) {
        return stuMajorMapper.selectByPrimaryKey(majorId);
    }

    @Override
    public int updateByPrimaryKeySelective(StuMajor record) {
        return stuMajorMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(StuMajor record) {
        return stuMajorMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<StuMajor> selectAllMajor() {
        return stuMajorMapper.selectAllMajor();
    }
}
