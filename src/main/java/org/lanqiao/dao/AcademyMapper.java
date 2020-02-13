package org.lanqiao.dao;

import org.lanqiao.bean.Academy;

import java.util.List;

public interface AcademyMapper {
    int deleteByPrimaryKey(Integer academyId);

    int insert(Academy record);

    int insertSelective(Academy record);

    Academy selectByPrimaryKey(Integer academyId);

    int updateByPrimaryKeySelective(Academy record);

    int updateByPrimaryKey(Academy record);

    List<Academy> findAllAcademy();
}