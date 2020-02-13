package org.lanqiao.service.impl;

import org.lanqiao.bean.Academy;
import org.lanqiao.dao.AcademyMapper;
import org.lanqiao.service.IAcademyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName SSMProject
 * @Package org.lanqiao.service.impl
 * @Date 2020/1/9 10:43
 * @Author pw
 */

@Service
public class AcademyServiceImpl implements IAcademyService {


    @Autowired
    private AcademyMapper academyMapper;

    @Override
    public int deleteByPrimaryKey(Integer academyId) {
        return academyMapper.deleteByPrimaryKey(academyId);
    }

    @Override
    public int insert(Academy record) {
        return academyMapper.insert(record);
    }

    @Override
    public int insertSelective(Academy record) {
        return academyMapper.insertSelective(record);
    }

    @Override
    public Academy selectByPrimaryKey(Integer academyId) {
        return academyMapper.selectByPrimaryKey(academyId);
    }

    @Override
    public int updateByPrimaryKeySelective(Academy record) {
        return academyMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Academy record) {
        return academyMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Academy> findAllAcademy() {
        return academyMapper.findAllAcademy();
    }

}
