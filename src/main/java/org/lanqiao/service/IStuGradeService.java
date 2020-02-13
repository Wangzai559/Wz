package org.lanqiao.service;

import org.lanqiao.bean.StuGrade;

import java.util.List;

/**
 * @ProjectName SSMProject
 * @Package org.lanqiao.service
 * @Date 2020/2/3 9:56
 * @Author pw
 */
public interface IStuGradeService {
    int deleteByPrimaryKey(Integer judgeResId);

    int insert(StuGrade record);

    int insertSelective(StuGrade record);

    List<StuGrade> selectAllGrade();
}
