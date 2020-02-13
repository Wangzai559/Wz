package org.lanqiao.service;

import org.lanqiao.bean.User;

public interface IUserService {
    /**
     * 添加学生信息
     * @param user
     * @return
     */
    int insert(User user);
    /**
     * 登录
     * @param user
     * @return
     */
    User LoginByNameandPass(User user);

    /**
     * 根据用户是否存在
     * @param user
     * @return
     */
    User CheckName(User user);

    int insertSelective(User user);



}
