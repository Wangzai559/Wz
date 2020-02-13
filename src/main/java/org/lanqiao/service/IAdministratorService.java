package org.lanqiao.service;

import org.lanqiao.bean.Administrator;

/**
 * @Author pw
 * @Date 2019/10/29
 * @Time 18:59
 */
public interface IAdministratorService {
    int deleteByPrimaryKey(Integer admId);

    int insert(Administrator record);

    int insertSelective(Administrator record);

    Administrator selectByPrimaryKey(Integer admId);

    int updateByPrimaryKeySelective(Administrator record);

    int updateByPrimaryKey(Administrator record);

    int getAdminByNameAndPass(Administrator administrator);
}
