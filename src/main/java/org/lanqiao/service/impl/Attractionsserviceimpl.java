package org.lanqiao.service.impl;

import org.lanqiao.bean.Attractions;
import org.lanqiao.dao.AttractionsMapper;
import org.lanqiao.service.IAttractionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class Attractionsserviceimpl implements IAttractionsService {
    @Autowired
    AttractionsMapper attractionsMapper;

    @Override
    public List<Attractions> getIndex() {
        return attractionsMapper.getIndex();
    }

    @Override
    public Attractions selectByPrimaryKey(Integer attId) {
        return attractionsMapper.selectByPrimaryKey(attId);
    }

    @Override
    public Attractions serAttName(String serName) {
        return attractionsMapper.serAttName(serName);
    }

    @Override
    public List<Attractions> getHeadPic() {
        return attractionsMapper.getHeadPic();
    }

    @Override
    public int deleteByPrimaryKey(Integer attId) {
        return attractionsMapper.deleteByPrimaryKey(attId);
    }

    @Override
    public int insert(Attractions record) {
        return attractionsMapper.insert(record);
    }

    @Override
    public int insertSelective(Attractions record) {
        return attractionsMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Attractions record) {
        return attractionsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Attractions record) {
        return attractionsMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Attractions> getAllAttractions() {
        return attractionsMapper.getAllAttractions();
    }

    @Override
    public int getAttrCount() {
        return attractionsMapper.getAttrCount();
    }


    @Override
    public List<Attractions> getPriceByPage(Map map) {
        return attractionsMapper.getPriceByPage(map);
    }

    @Override
    public List<Attractions> getStarByPage(Map map) {
        return attractionsMapper.getStarByPage(map);
    }

    @Override
    public List<Attractions> getAllByPage(Map map) {
        return attractionsMapper.getAllByPage(map);
    }

    @Override
    public int getCount() {
        return attractionsMapper.getCount();
    }


}
