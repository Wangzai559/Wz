package org.lanqiao.service.impl;

import org.lanqiao.bean.BlogDto;
import org.lanqiao.dao.BlogDtoMapper;
import org.lanqiao.service.IBlogDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author pw
 * @Date 2019/10/31
 * @Time 9:57
 */

@Service
public class BlogDtoServiceImpl implements IBlogDtoService {

    @Autowired
    BlogDtoMapper blogDtoMapper;

    @Override
    public List<BlogDto> getAllBlogDto() {
        return blogDtoMapper.getAllBlogDto();
    }

    @Override
    public int delBlogDto(Integer magId) {
        return blogDtoMapper.delBlogDto(magId);
    }

    @Override
    public List<BlogDto> getBlogByPage(Map map) {
        return blogDtoMapper.getBlogByPage(map);
    }

    @Override
    public int getCount() {
        return blogDtoMapper.getCount();
    }


}
