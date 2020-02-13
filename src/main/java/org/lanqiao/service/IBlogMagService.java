package org.lanqiao.service;

import org.lanqiao.bean.Blog;
import org.lanqiao.bean.BlogMag;

import java.util.List;


public interface IBlogMagService {

    /**
     * 根据博客id查询评价信息
     * @param blogId
     * @return
     */
    Blog getBlogMag1(Integer blogId);

    List<BlogMag> getBlogMag(Integer blogId);

    /**
     * 添加评论
     * @param record
     * @return
     */
    int insert(BlogMag record);
}
