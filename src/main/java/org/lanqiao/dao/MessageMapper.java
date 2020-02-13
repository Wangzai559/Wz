package org.lanqiao.dao;

import org.lanqiao.bean.Message;

import java.util.List;
import java.util.Map;

public interface MessageMapper {
    int deleteByPrimaryKey(Integer magId);

    /**
     * 查询所有评论
     * @return
     */
    List<Message> selectAllMessage();

    /**
     * 增加评论
     * @param record
     * @return
     */
    int insert(Message record);

    /**
     * 分页展示所有信息
     * @param map
     * @return
     */
    List<Message> selectAllMessageByPage(Map map);

    /**
     * 查询总条数
     * @return
     */
    int selectAllCount();


    int insertSelective(Message record);

    Message selectByPrimaryKey(Integer magId);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);


}