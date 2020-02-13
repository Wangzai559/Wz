package org.lanqiao.dao;

import org.lanqiao.bean.Administrator;

public interface AdministratorMapper {
    int deleteByPrimaryKey(Integer admId);

    int insert(Administrator record);

    int insertSelective(Administrator record);

    Administrator selectByPrimaryKey(Integer admId);

    int updateByPrimaryKeySelective(Administrator record);

    int updateByPrimaryKey(Administrator record);

    int getAdminByNameAndPass(Administrator administrator);
}