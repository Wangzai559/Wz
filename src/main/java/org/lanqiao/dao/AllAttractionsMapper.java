package org.lanqiao.dao;

import org.lanqiao.bean.AllAttractions;
import org.lanqiao.bean.Attractions;

import java.util.List;
import java.util.Map;

public interface AllAttractionsMapper {
    int deleteByPrimaryKey(Integer allId);

    int insert(AllAttractions record);

    int insertSelective(AllAttractions record);

    AllAttractions selectByPrimaryKey(Integer allId);

    int updateByPrimaryKeySelective(AllAttractions record);

    int updateByPrimaryKey(AllAttractions record);
    //景点名模糊查询
    List<AllAttractions> serAttName(String serName);
    //分页展示
    List<AllAttractions> getPage(Map map);
    //获取总条数
    int getPageCount();
}