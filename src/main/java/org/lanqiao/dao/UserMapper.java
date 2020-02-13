package org.lanqiao.dao;

import org.lanqiao.bean.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User user);

    int insertSelective(User user);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 检查用户名是否存在
     * @param user
     * @return
     */
    User CheckName(User user);

    /**
     * 根据用户和密码登录
     * @param user
     * @return
     */

    User LoginByNameandPass(User user);


}