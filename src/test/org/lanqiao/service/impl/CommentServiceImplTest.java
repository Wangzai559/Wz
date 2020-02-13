package org.lanqiao.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lanqiao.bean.Comment;
import org.lanqiao.dao.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @ProjectName SSMProject
 * @Package org.lanqiao.service.impl
 * @Date 2020/1/11 14:23
 * @Author pw
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class CommentServiceImplTest {

    @Autowired
    CommentMapper commentMapper;
    @Test
    public void getAllComments() {
        System.out.println(commentMapper.findAllComments());
    }

    @Test
    public void getComments(){
        System.out.println(commentMapper.selectByPrimaryKey(3));
    }

    @Test
    public void delComments(){
        System.out.println(commentMapper.deleteByPrimaryKey(3));
    }

    @Test
    public void addComments(){
        Comment comment = new Comment();
        comment.setCommentId(3);
        comment.setCommentContent("这是一条测试语句！");
        System.out.println(commentMapper.insert(comment));
    }
    @Test
    public void modifyComments(){
        Comment comment = new Comment();
        comment.setCommentId(3);
        comment.setCommentContent("这条语句被修改过！");
        System.out.println(commentMapper.updateByPrimaryKeySelective(comment));
    }
}