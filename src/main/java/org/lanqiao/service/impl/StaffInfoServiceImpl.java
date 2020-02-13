package org.lanqiao.service.impl;

import org.lanqiao.bean.StaffInfo;
import org.lanqiao.dao.StaffInfoMapper;
import org.lanqiao.service.IStaffInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName SSMProject
 * @Package org.lanqiao.service.impl
 * @Date 2020/2/3 11:12
 * @Author pw
 */

@Service
public class StaffInfoServiceImpl implements IStaffInfoService {

    @Autowired
    private StaffInfoMapper staffInfoMapper;

    @Override
    public int deleteByPrimaryKey(Integer staffId) {
        return staffInfoMapper.deleteByPrimaryKey(staffId);
    }

    @Override
    public int insert(StaffInfo record) {
        return staffInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(StaffInfo record) {
        return staffInfoMapper.insertSelective(record);
    }

    @Override
    public StaffInfo selectByPrimaryKey(Integer staffId) {
        return staffInfoMapper.selectByPrimaryKey(staffId);
    }

    @Override
    public int updateByPrimaryKeySelective(StaffInfo record) {
        return staffInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(StaffInfo record) {
        return staffInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<StaffInfo> selectAllStaffInfo() {
        return staffInfoMapper.selectAllStaffInfo();
    }
}
