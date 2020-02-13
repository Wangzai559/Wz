package org.lanqiao.dao;

import org.lanqiao.bean.Attractions;

import java.util.List;
import java.util.Map;

public interface AttractionsMapper {
    int deleteByPrimaryKey(Integer attId);

    int insert(Attractions record);

    int insertSelective(Attractions record);

    Attractions selectByPrimaryKey(Integer attId);

    int updateByPrimaryKeySelective(Attractions record);

    int updateByPrimaryKey(Attractions record);

    //查询首页景点信息
    List<Attractions> getIndex();
    //景点名模糊查询
    Attractions serAttName(String serName);
    //查询主页头部图片
    List<Attractions> getHeadPic();


    List<Attractions> getAllAttractions();

    int getAttrCount();

    List<Attractions> getPriceByPage(Map map);

    List<Attractions> getStarByPage(Map map);

    /**
     * 查询所有
     * @return
     */
    List<Attractions> getAllByPage(Map map);

    /**
     * 查询总数
     * @return
     */
    int getCount();
}