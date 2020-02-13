package org.lanqiao.service;

import org.lanqiao.bean.Attractions;

import java.util.List;
import java.util.Map;

public interface IAttractionsService {
    //获取全部景点详情
    List<Attractions> getIndex();
    //获取单个景点详情
    Attractions selectByPrimaryKey(Integer attId);
    //关键字查询景点信息
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

    //增删改
    int deleteByPrimaryKey(Integer attId);

    int insert(Attractions record);

    int insertSelective(Attractions record);

    int updateByPrimaryKeySelective(Attractions record);

    int updateByPrimaryKey(Attractions record);
}
