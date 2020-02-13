package org.lanqiao.dao;

import org.lanqiao.bean.StaffInfo;

import java.util.List;

public interface StaffInfoMapper {
    int deleteByPrimaryKey(Integer staffId);

    int insert(StaffInfo record);

    int insertSelective(StaffInfo record);

    StaffInfo selectByPrimaryKey(Integer staffId);

    int updateByPrimaryKeySelective(StaffInfo record);

    int updateByPrimaryKey(StaffInfo record);

    List<StaffInfo> selectAllStaffInfo();
}