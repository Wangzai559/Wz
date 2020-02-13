package org.lanqiao.service;

import org.lanqiao.bean.Message;

import java.util.List;
import java.util.Map;

public interface IMessageService {
    /**
     * 增加评论
     *
     * @param record
     * @return
     */
    int insert(Message record);
    /**
     * 查询所有评论
     * @return
     */
    List<Message> selectAllMessage();

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
}
