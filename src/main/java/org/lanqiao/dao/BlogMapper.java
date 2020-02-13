package org.lanqiao.dao;

import org.lanqiao.bean.Blog;


import java.util.List;
import java.util.Map;

public interface BlogMapper {

    int deleteByPrimaryKey(Integer blogId);

    /**
     * 添加博客信息
     * @param record
     * @return
     */
    int insert(Blog record);

    int insertSelective(Blog record);

    /**
     * 根据id查找博客信息
     * @param blogId
     * @return
     */
    Blog selectByPrimaryKey(Integer blogId);

    int updateByPrimaryKeySelective(Blog record);

    int updateByPrimaryKey(Blog record);


    /**
     * 查询所有博客
     * @return
     */
    List<Blog> getAllBlog(Map map);


    /**
     * 根据分类查找博客信息
     * @return
     */
    List<Blog> getAllBlogBySort(String sort);


    /**
     * 根据时间显示博客信息
     * @param
     * @return
     */
    List<Blog> getAllBlogByDate();

    /**
     * 根据评价显示
     * @return
     */
    List<Blog> getAllBlogByMag();

    /**
     * 博客总数
     * @return
     */
    int getBlogCount();
}