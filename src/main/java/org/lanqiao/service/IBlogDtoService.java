package org.lanqiao.service;

import org.lanqiao.bean.BlogDto;

import java.util.List;
import java.util.Map;

/**
 * @Author pw
 * @Date 2019/10/31
 * @Time 9:56
 */
public interface IBlogDtoService {

    List<BlogDto> getAllBlogDto();

    int delBlogDto(Integer magId);


    /**
     * 查询所有
     * @return
     */
    List<BlogDto> getBlogByPage(Map map);

    /**
     * 查询总数
     * @return
     */
    int getCount();
}
