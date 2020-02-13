package org.lanqiao.service;

import org.lanqiao.bean.StuMajor;

import java.util.List;

/**
 * @ProjectName SSMProject
 * @Package org.lanqiao.service
 * @Date 2020/2/3 9:55
 * @Author pw
 */
public interface IStuMajorService {
    int deleteByPrimaryKey(Integer majorId);

    int insert(StuMajor record);

    int insertSelective(StuMajor record);

    StuMajor selectByPrimaryKey(Integer majorId);

    int updateByPrimaryKeySelective(StuMajor record);

    int updateByPrimaryKey(StuMajor record);

    List<StuMajor> selectAllMajor();
}
