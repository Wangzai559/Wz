package org.lanqiao.service.impl;

import org.lanqiao.bean.AllAttractions;
import org.lanqiao.bean.Attractions;
import org.lanqiao.dao.AllAttractionsMapper;
import org.lanqiao.service.IAllAttractionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AllSttractionsserviceimpl implements IAllAttractionsService {
    @Autowired
    AllAttractionsMapper allAttractionsMapper;
    @Override
    public List<AllAttractions> serAttName(String serName) {
        return allAttractionsMapper.serAttName(serName);
    }

    @Override
    public int getPageCount() {
        return allAttractionsMapper.getPageCount();
    }

    @Override
    public List<AllAttractions> getPage(Map map) {
        return allAttractionsMapper.getPage(map);
    }

    //通过Id查询
    @Override
    public AllAttractions selectByPrimaryKey(Integer allId) {
        return allAttractionsMapper.selectByPrimaryKey(allId);
    }
}
