package org.lanqiao.service.impl;

import org.lanqiao.bean.Details;
import org.lanqiao.dao.DetailsMapper;
import org.lanqiao.service.IDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailsServiceImpl implements IDetailsService{
    @Autowired
    DetailsMapper detailsMapper;
    @Override
    public int deleteByPrimaryKey(Integer detId) {
        return detailsMapper.deleteByPrimaryKey(detId);
    }

    @Override
    public int insert(Details record) {
        return detailsMapper.insert(record);
    }

    @Override
    public int insertSelective(Details record) {
        return detailsMapper.insertSelective(record);
    }

    @Override
    public Details selectByPrimaryKey(Integer detId) {
        return detailsMapper.selectByPrimaryKey(detId);
    }

    @Override
    public int updateByPrimaryKeySelective(Details record) {
        return detailsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Details record) {
        return detailsMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Details> getAllDetails() {
        return detailsMapper.getAllDetails();
    }

    @Override
    public List<Details> selectDetailsByCondition(Details details) {
        return detailsMapper.selectDetailsByCondition(details);
    }
}
