package org.lanqiao.service.impl;


import org.lanqiao.bean.Blog;
import org.lanqiao.bean.BlogList;
import org.lanqiao.dao.BlogMapper;
import org.lanqiao.service.IBlogService;
import org.lanqiao.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Map;


@Service  //把业务注册到spring里
public class BlogServiceImpl implements IBlogService {

    //根据类型自动注入studentDao对象
    @Autowired
    BlogMapper blogMapper;
    @Autowired
    RedisService redisService;

    //声明key的前缀，为了避免key冲突
    private static final String USER_PREFIX="travelDemo:blog";

    @Override
    public BlogList selectAllBlog(Map map) {
        BlogList blogList=redisService.get(USER_PREFIX+"all",BlogList.class);
        if (blogList==null){
            blogList.setBlogList(blogMapper.getAllBlog(map));
            if (blogMapper.getAllBlog(map)!=null){
                redisService.set(USER_PREFIX+"all",blogList,30*60);
            }
        }
       return  blogList;
    }

    @Override
    public List<Blog> getAllBlogBySort(String sort) {
        return blogMapper.getAllBlogBySort(sort);
    }

    @Override
    public List<Blog> getAllBlogByMag() {
        return blogMapper.getAllBlogByMag();
    }


    @Override
    public List<Blog> getAllBlogByDate() {
        return blogMapper.getAllBlogByDate();
    }

    @Override
    public Blog selectByPrimaryKey(Integer blogId) {
        return blogMapper.selectByPrimaryKey(blogId);
    }

    @Override
    public int getBlogCount() {
        return blogMapper.getBlogCount();
    }

    @Override
    public int insert(Blog record) {
        return blogMapper.insert(record);
    }

    @Override
    public int insertSelective(Blog record) {
        return blogMapper.insertSelective(record);
    }

    @Override
    public List<Blog> getAllBlog(Map map) {
        return blogMapper.getAllBlog(map);
    }

}
