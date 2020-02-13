package org.lanqiao.service.impl;

import org.lanqiao.bean.StuInfo;
import org.lanqiao.dao.StuInfoMapper;
import org.lanqiao.service.IStuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName SSMProject
 * @Package org.lanqiao.service.impl
 * @Date 2020/1/8 11:19
 * @Author pw
 */

@Service
public class StuInfoServiceImpl implements IStuInfoService {

    @Autowired
    private StuInfoMapper stuInfoMapper;

    @Override
    public List<StuInfo> findAll() {
        return  stuInfoMapper.selectAll();
    }

    @Override
    public StuInfo getStuByStuId(Integer stuId) {
        return stuInfoMapper.selectByPrimaryKey(stuId);
    }

    @Override
    public int delStuInfoByStuId(Integer stuId) {
        return stuInfoMapper.deleteByPrimaryKey(stuId);
    }

    @Override
    public int updateStuInfo(StuInfo stuInfo) {
        return stuInfoMapper.updateByPrimaryKeySelective(stuInfo);
    }

    @Override
    public int insertStuInfo(StuInfo stuInfo) {
        return stuInfoMapper.insert(stuInfo);
    }
}
