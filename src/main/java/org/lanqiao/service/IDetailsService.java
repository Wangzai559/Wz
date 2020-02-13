package org.lanqiao.service;

import org.lanqiao.bean.Details;


import java.util.List;

public interface IDetailsService {
    int deleteByPrimaryKey(Integer detId);

    int insert(Details record);

    int insertSelective(Details record);

    Details selectByPrimaryKey(Integer detId);

    int updateByPrimaryKeySelective(Details record);

    int updateByPrimaryKey(Details record);

    /**
     * 查询所有旅客信息
     * @return
     */
    List<Details> getAllDetails();

    /**
     * 根据条件查询旅客信息
     * @param details
     * @return
     */
    List<Details> selectDetailsByCondition(Details details);
}
