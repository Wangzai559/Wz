package org.lanqiao.service;

import org.lanqiao.bean.Comment;

import java.util.List;

/**
 * @ProjectName SSMProject
 * @Package org.lanqiao.service
 * @Date 2020/1/9 15:29
 * @Author pw
 */
public interface ICommentService {
    int deleteByPrimaryKey(Integer commentId);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Integer commentId);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);

    List<Comment> findAllComments();
}
