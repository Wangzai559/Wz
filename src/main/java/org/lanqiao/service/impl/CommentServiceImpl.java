package org.lanqiao.service.impl;

import org.lanqiao.bean.Comment;
import org.lanqiao.dao.CommentMapper;
import org.lanqiao.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName SSMProject
 * @Package org.lanqiao.service.impl
 * @Date 2020/1/9 15:29
 * @Author pw
 */

@Service
public class CommentServiceImpl implements ICommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public int deleteByPrimaryKey(Integer commentId) {
        return commentMapper.deleteByPrimaryKey(commentId);
    }

    @Override
    public int insert(Comment record) {
        return commentMapper.insert(record);
    }

    @Override
    public int insertSelective(Comment record) {
        return commentMapper.insertSelective(record);
    }

    @Override
    public Comment selectByPrimaryKey(Integer commentId) {
        return commentMapper.selectByPrimaryKey(commentId);
    }

    @Override
    public int updateByPrimaryKeySelective(Comment record) {
        return commentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Comment record) {
        return commentMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Comment> findAllComments() {
        return commentMapper.findAllComments();
    }


}
