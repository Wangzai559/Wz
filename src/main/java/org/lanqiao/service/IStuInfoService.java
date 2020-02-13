package org.lanqiao.service;

import org.lanqiao.bean.StuInfo;

import java.util.List;

/**
 * @ProjectName SSMProject
 * @Package org.lanqiao.service
 * @Date 2020/1/8 11:18
 * @Author pw
 */
public interface IStuInfoService {

    /**
     * 查询所有信息
     * @return
     */
    List<StuInfo> findAll();


    StuInfo getStuByStuId(Integer stuId);

    int delStuInfoByStuId(Integer stuId);

    int updateStuInfo(StuInfo stuInfo);

    int insertStuInfo(StuInfo stuInfo);
}
