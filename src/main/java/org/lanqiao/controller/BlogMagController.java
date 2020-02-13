package org.lanqiao.controller;



import org.lanqiao.bean.Blog;

import org.lanqiao.bean.BlogMag;
import org.lanqiao.service.IBlogMagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/blogMags")
public class BlogMagController {

  @Autowired
  IBlogMagService blogMagService;

    @GetMapping(value = "/{blogId}")
    public List<BlogMag> selectByPrimaryKey(@PathVariable Integer blogId){
        return  blogMagService.getBlogMag(blogId);
    }

    @PostMapping(value = "")
  public int addMessage(@RequestBody BlogMag record){
      return blogMagService.insert(record);
    }

}
