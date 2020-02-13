package org.lanqiao.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lanqiao.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @ProjectName SSMProject
 * @Package org.lanqiao.controller
 * @Date 2020/1/29 19:08
 * @Author pw
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class CommentControllerTest {


    @Autowired
    private ICommentService commentService;
    @Test
    public void delComment() {
        System.out.println(commentService.deleteByPrimaryKey(3));
    }

    @Test
    public void addComment() {
    }

    @Test
    public void updateComment() {
    }

    @Test
    public void getCommentById() {
        System.out.println(commentService.selectByPrimaryKey(3));
    }

    @Test
    public void getAllComments() {
        System.out.println(commentService.findAllComments());
    }
}