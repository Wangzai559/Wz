package org.lanqiao.dao;

import org.lanqiao.bean.Blog;
import org.lanqiao.bean.BlogMag;

import java.util.List;

public interface BlogMagMapper {
    int deleteByPrimaryKey(Integer magId);

    int insert(BlogMag record);

    int insertSelective(BlogMag record);

    BlogMag selectByPrimaryKey(Integer magId);

    int updateByPrimaryKeySelective(BlogMag record);

    int updateByPrimaryKey(BlogMag record);

    /**
     * 根据博客id查询评价信息
     * @param blogId
     * @return
     */
   Blog getBlogMag1(Integer blogId);


   List<BlogMag> getBlogMag(Integer blogId);
}