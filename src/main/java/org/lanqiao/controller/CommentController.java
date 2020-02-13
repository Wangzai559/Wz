package org.lanqiao.controller;

import org.lanqiao.bean.Comment;
import org.lanqiao.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ProjectName SSMProject
 * @Package org.lanqiao.controller
 * @Date 2020/1/9 15:34
 * @Author pw
 */

@RestController
@RequestMapping("api/comment")
public class CommentController {

    @Autowired
    ICommentService commentService;

    @PostMapping("/del/{commentId}")
    public int delComment(@PathVariable Integer commentId){
        return commentService.deleteByPrimaryKey(commentId);
    }

    @PostMapping("/add")
    public int addComment(@RequestBody Comment comment){
        return commentService.insertSelective(comment);
    }

    @PutMapping("/update")
    public int updateComment(@RequestBody Comment comment){
        return commentService.updateByPrimaryKeySelective(comment);
    }

    @GetMapping("/{commentId}")
    public Comment getCommentById(@PathVariable Integer commentId){
        return commentService.selectByPrimaryKey(commentId);
    }

    @GetMapping("/all")
    public List<Comment> getAllComments(){
        return  commentService.findAllComments();
    }
}
