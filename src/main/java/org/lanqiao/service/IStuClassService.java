package org.lanqiao.service;

import org.lanqiao.bean.StuClass;

import java.util.List;

/**
 * @ProjectName SSMProject
 * @Package org.lanqiao.service
 * @Date 2020/2/3 9:56
 * @Author pw
 */
public interface IStuClassService {
    int deleteByPrimaryKey(Integer classId);

    int insert(StuClass record);

    int insertSelective(StuClass record);

    StuClass selectByPrimaryKey(Integer classId);

    int updateByPrimaryKeySelective(StuClass record);

    int updateByPrimaryKey(StuClass record);

    List<StuClass> selectAllClass();
}
