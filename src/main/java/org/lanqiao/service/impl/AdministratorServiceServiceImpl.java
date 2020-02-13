package org.lanqiao.service.impl;

import org.lanqiao.bean.Administrator;
import org.lanqiao.dao.AdministratorMapper;
import org.lanqiao.service.IAdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author pw
 * @Date 2019/10/29
 * @Time 18:59
 */
@Service
public class AdministratorServiceServiceImpl implements IAdministratorService {

    @Autowired
    AdministratorMapper administratorMapper;

    @Override
    public int deleteByPrimaryKey(Integer admId) {
        return administratorMapper.deleteByPrimaryKey(admId);
    }

    @Override
    public int insert(Administrator record) {
        return administratorMapper.insert(record);
    }

    @Override
    public int insertSelective(Administrator record) {
        return administratorMapper.insertSelective(record);
    }

    @Override
    public Administrator selectByPrimaryKey(Integer admId) {
        return administratorMapper.selectByPrimaryKey(admId);
    }

    @Override
    public int updateByPrimaryKeySelective(Administrator record) {
        return administratorMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Administrator record) {
        return administratorMapper.updateByPrimaryKey(record);
    }

    @Override
    public int getAdminByNameAndPass(Administrator administrator) {
        return administratorMapper.getAdminByNameAndPass(administrator);
    }
}
