package org.lanqiao.dao;

import org.lanqiao.bean.StuInfo;

import java.util.List;

public interface StuInfoMapper {
    int deleteByPrimaryKey(Integer stuId);

    int insert(StuInfo record);

    int insertSelective(StuInfo record);

    StuInfo selectByPrimaryKey(Integer stuId);

    int updateByPrimaryKeySelective(StuInfo record);

    int updateByPrimaryKey(StuInfo record);

    /**
     * 查询所有信息
     * @return
     */
    List<StuInfo> selectAll();

}