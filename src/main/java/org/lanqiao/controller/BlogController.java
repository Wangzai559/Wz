package org.lanqiao.controller;


import org.apache.commons.io.FileUtils;
import org.lanqiao.bean.Blog;
import org.lanqiao.bean.Page;
import org.lanqiao.service.IBlogService;
import org.lanqiao.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/blog")
public class BlogController {

    @Autowired
    IBlogService blogService;

    @Autowired
    RedisService redisService;

    @GetMapping(value = "/page/{currentPage}")
    public Map getAllBlog(@PathVariable Integer currentPage){
        //当前页
        int currentPage1=currentPage;
        //当前页面大小
        int pageSize=4;
        //数据总条数
        int totalCount=blogService.getBlogCount();
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
       List<Blog> blogList= blogService.getAllBlog(map);
       //创建一个map集合存放需要创给前台的学生集合数据和Page对象
        Map map1=new HashMap();
        map1.put("blogList",blogList);
        map1.put("page",page);
        //返回map集合
        return map1;
    }


    @GetMapping(value = "/cond/{blogId}")
    public Blog selectByPrimaryKey(@PathVariable Integer blogId){
        return blogService.selectByPrimaryKey(blogId);
    }

    @GetMapping(value = "/sort/{blogSort}")
    public List<Blog> getAllBlogBySort(@PathVariable String blogSort){

        return blogService.getAllBlogBySort(blogSort);
    }

    @GetMapping(value = "/date")
    public List<Blog> getAllBlogByDate(){
        return blogService.getAllBlogByDate();
    }

    @GetMapping(value = "/mag")
    public List<Blog> getAllBlogByMag(){
        return blogService.getAllBlogByMag();
    }

    @PostMapping(value = "/add")
    public int addBlog(MultipartFile file,MultipartFile file1, Blog blog,HttpServletRequest request) throws IOException {
        //获取文件的输入流
        InputStream in = file.getInputStream();
        //设置路径下的images文件夹下
        String uploadPath = request.getSession().getServletContext().getRealPath("img");
        //声明文件的输出位置
        File out = new File(uploadPath+File.separator+file.getOriginalFilename());
        //文件复制
        FileUtils.copyToFile(in,out);
        String blogImg = "img/"+file.getOriginalFilename();
        String blogAutherPhoto="img/"+file1.getOriginalFilename();
        blog.setBlogImg(blogImg);
        blog.setBlogAutherPhoto(blogAutherPhoto);
        return blogService.insert(blog);
    }
}
