package org.lanqiao.controller;

import org.lanqiao.bean.AllAttractions;
import org.lanqiao.bean.Attractions;
import org.lanqiao.bean.Page;
import org.lanqiao.service.IAllAttractionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("api/page")
@RestController
public class AllAttController {
    //声明创建IAllAttractionsserviceimpl
    @Autowired
    IAllAttractionsService iAllAttractionsService;
    //根据条件查找景点
    @GetMapping(value = "/serName/{allRegion}")
    public List<AllAttractions> serName(@PathVariable String allRegion){
        return iAllAttractionsService.serAttName(allRegion);
    }
    //分页
    @GetMapping(value = "/{allRegion}/{currentPage}")
    public Map getPage(@PathVariable String allRegion,@PathVariable Integer currentPage){
        System.out.println("=====================================");
        //分页查询
        //声明当前页
        int currentPages = 0;
        //声明每页显示的条数
        int pageSize = 12;
        //查询数据总条数
        int count = iAllAttractionsService.getPageCount();
        //创建page对象
        Page page = new Page();
        page.setPageSize(pageSize);
        page.setTotalCount(count);
        //获取当前页参数
        Integer current = currentPage;
        if (current <= 1){
            currentPages = 1;
        }else{
            currentPages = current;
        }
        //判断当前页，不能大于总页数，不能小于第一页
        if(currentPages<1){
            currentPages = 1;
        }
        if (currentPages>page.getTotalCount()){
            currentPages = page.getTotalPage();
        }
        Map map = new HashMap<>();
        map.put("start",(currentPages-1)*pageSize);
        map.put("lines",pageSize);
        map.put("serName",allRegion);
        //获取学生信息
        List<AllAttractions> showPage = iAllAttractionsService.getPage(map);

        Map map1 = new HashMap<>();
        map1.put("showPage",showPage);
        map1.put("page",page);
        return map1;
    }
    //查询单个景点详情
    //查询单个景点详情
    @GetMapping(value = "/{attId}")
    public AllAttractions getOnePage(@PathVariable Integer attId){
        System.out.println(attId);
        return iAllAttractionsService.selectByPrimaryKey(attId);
    }
}
