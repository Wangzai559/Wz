package org.lanqiao.service.impl;

import org.lanqiao.bean.Message;
import org.lanqiao.dao.MessageMapper;
import org.lanqiao.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MessageServiceImpl implements IMessageService {

    @Autowired
    MessageMapper messageMapper;

    /**
     * 添加一条评价
     * @param record
     * @return
     */
    @Override
    public int insert(Message record) {
        return messageMapper.insert(record);
    }

    @Override
    public List<Message> selectAllMessage() {
        return messageMapper.selectAllMessage();
    }

    @Override
    public List<Message> selectAllMessageByPage(Map map) {
        return messageMapper.selectAllMessageByPage(map);
    }

    @Override
    public int selectAllCount() {
        return messageMapper.selectAllCount();
    }
}
