package org.lanqiao.service.impl;

import org.lanqiao.bean.Blog;
import org.lanqiao.bean.BlogMag;
import org.lanqiao.dao.BlogMagMapper;
import org.lanqiao.service.IBlogMagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BlogMagServiceImpl implements IBlogMagService {

    @Autowired
    BlogMagMapper blogMagMapper;


    @Override
    public Blog getBlogMag1(Integer blogId) {
        return null;
    }

    @Override
    public List<BlogMag> getBlogMag(Integer blogId) {
        return blogMagMapper.getBlogMag(blogId);
    }

    @Override
    public int insert(BlogMag record) {
        return blogMagMapper.insert(record);
    }
}
