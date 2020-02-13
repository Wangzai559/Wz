package org.lanqiao.service;

import org.lanqiao.bean.StaffInfo;

import java.util.List;

/**
 * @ProjectName SSMProject
 * @Package org.lanqiao.service
 * @Date 2020/2/3 9:58
 * @Author pw
 */
public interface IStaffInfoService {
    int deleteByPrimaryKey(Integer staffId);

    int insert(StaffInfo record);

    int insertSelective(StaffInfo record);

    StaffInfo selectByPrimaryKey(Integer staffId);

    int updateByPrimaryKeySelective(StaffInfo record);

    int updateByPrimaryKey(StaffInfo record);

    List<StaffInfo> selectAllStaffInfo();
}
