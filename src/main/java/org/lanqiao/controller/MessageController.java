package org.lanqiao.controller;

import org.lanqiao.bean.Message;
import org.lanqiao.bean.Page;
import org.lanqiao.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/message")
public class MessageController {
    //声明创建messageService
    @Autowired
    IMessageService messageService;

    /**
     * 添加一条评论
     * @param record
     * @return
     */
    @PostMapping(value = "")
    public int insert(@RequestBody Message record){

        System.out.println(record);

        return messageService.insert(record);
    }

    /**
     * 分页查询所有评论
     * @return
     */
    @GetMapping (value = "/page/{currentPage}")
    public Map selectAllMessageByPage(@PathVariable Integer currentPage){
        //当前页
        int currentPage1 =currentPage;
        //页面大小
        int pageSize = 5 ;
        //数据总条数
        int totalCount = messageService.selectAllCount();
        //声明创建page对象,并传入需要的属性值
        Page page = new Page();
        page.setPageSize(pageSize);
        page.setTotalCount(totalCount);
        //对当前页进行边界判定
        if (currentPage1<=1){  //小于1时让他等于1
            currentPage1 = 1;
        }else if (currentPage1>=page.getTotalPage()){  //大于最大页数时,让他等于最大页数
            currentPage1 = currentPage;
        }else {  //否则等于currentPage
            currentPage1 = currentPage;
        }
        //把当前页传入page对象
        page.setCurrentPage(currentPage1);
        //创建map对象,用于存放查询所需要的数据
        Map map = new HashMap();
        map.put("upTo",(currentPage1-1)*pageSize);
        map.put("pageSize",pageSize);
        List<Message> messageList  = messageService.selectAllMessageByPage(map);

        //创建一个map集合存放需要传给前台的集合数据和page对象
        Map map1 = new HashMap();
        map1.put("messageList", messageList);
        map1.put("page",page);
        //返回map集合
        return map1;

    }

    /**
     * 查询评论总条数
     * @return
     */
    @GetMapping(value = "/count")
    public int selectAllCount(){
        return messageService.selectAllCount();
    }

}
