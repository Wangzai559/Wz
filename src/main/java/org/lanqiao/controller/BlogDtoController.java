package org.lanqiao.controller;

import org.lanqiao.bean.BlogDto;
import org.lanqiao.bean.Orders;
import org.lanqiao.bean.Page;
import org.lanqiao.service.IBlogDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author pw
 * @Date 2019/10/31
 * @Time 10:03
 */

@RestController
@Controller
@RequestMapping("api/blog")
public class BlogDtoController {

    @Autowired
    IBlogDtoService blogDtoService;

    @GetMapping(value = "/{currentPage}")
    public Map getBlogByPage(@PathVariable Integer currentPage){

        //当前页
        int currentPage1=currentPage;
        //当前页面大小
        int pageSize=10;
        //数据总条数
        int totalCount=blogDtoService.getCount();
        //声明创建page对象并传入需要的属性值
        Page page=new Page();
        page.setPageSize(pageSize);
        page.setTotalCount(totalCount);
        //对当前页进行边界判定
        if (currentPage1<=1){
            currentPage1=1;
        }else if (currentPage1>=page.getTotalPage()){
            currentPage1=page.getTotalPage();
        }else {
            currentPage1=currentPage;
        }
        //把当前页传入page对象
        page.setCurrentPage(currentPage1);
        //创建一个map对象用户存放查询所需要的数据
        Map map=new HashMap();
        map.put("upTo",(currentPage1-1)*pageSize);
        map.put("pageSize",pageSize);
        List<BlogDto> blogDtos=blogDtoService.getBlogByPage(map);
        //创建一个map集合存放需要创给前台的学生集合数据和Page对象
        Map map1=new HashMap();
        map1.put("blogDtos",blogDtos);
        map1.put("page",page);
        //返回map集合
        return map1;
    }


    @GetMapping("")
    public List<BlogDto> getBlogDto(){
        return blogDtoService.getAllBlogDto();
    }

    @DeleteMapping(value = "/{magId}")
    public int delBlogDto(@PathVariable Integer magId){
        System.out.println(magId);
        return blogDtoService.delBlogDto(magId);
    }

}
