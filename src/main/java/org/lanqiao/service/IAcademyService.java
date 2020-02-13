package org.lanqiao.service;

import org.lanqiao.bean.Academy;

import java.util.List;

/**
 * @ProjectName SSMProject
 * @Package org.lanqiao.service
 * @Date 2020/1/9 10:42
 * @Author pw
 */
public interface IAcademyService {

    int deleteByPrimaryKey(Integer academyId);

    int insert(Academy record);

    int insertSelective(Academy record);

    Academy selectByPrimaryKey(Integer academyId);

    int updateByPrimaryKeySelective(Academy record);

    int updateByPrimaryKey(Academy record);

    List<Academy> findAllAcademy();
}
