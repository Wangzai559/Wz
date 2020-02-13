package org.lanqiao.service;

import org.lanqiao.bean.AllAttractions;
import org.lanqiao.bean.Attractions;

import java.util.List;
import java.util.Map;

public interface IAllAttractionsService {
    //关键字查询景点信息
    List<AllAttractions> serAttName(String serName);
    //查询总条数
    int getPageCount();
    //分页展示
    List<AllAttractions> getPage(Map map);
    //通过Id查询
    AllAttractions selectByPrimaryKey(Integer allId);
}
