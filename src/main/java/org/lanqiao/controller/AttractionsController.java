package org.lanqiao.controller;

import org.lanqiao.bean.Attractions;
import org.lanqiao.bean.Page;
import org.lanqiao.service.IAttractionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RequestMapping("api/index")
@RestController
public class AttractionsController {
    //声明并创建IAttractionService
    @Autowired
    IAttractionsService attractionsService;
    //查询主页信息 查询所有景点信息
    @GetMapping(value = "")
    public List<Attractions> getIndex(){
        return attractionsService.getIndex();
    }

    //根据条件查找景点
    @GetMapping(value = "/serName/{attName}")
    public Attractions serAttName(@PathVariable String attName){
        return attractionsService.serAttName(attName);
    }

    //查询单个景点详情
    @GetMapping(value = "/{attId}")
    public Attractions getOnePage(@PathVariable Integer attId){
        return attractionsService.selectByPrimaryKey(attId);
    }

    //展示主页头部图片
    @GetMapping(value = "/headPicture")
    public List<Attractions> getHeadPic(){
        return attractionsService.getHeadPic();
    }


    //潘旺
    @GetMapping(value = "/page/{currentPage}")
    public Map getOrderByPage(@PathVariable Integer currentPage){
        //当前页
        int currentPage1=currentPage;
        //当前页面大小
        int pageSize=10;
        //数据总条数
        int totalCount=attractionsService.getCount();
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
        List<Attractions> attractions=attractionsService.getAllByPage(map);
        //创建一个map集合存放需要创给前台的学生集合数据和Page对象
        Map map1=new HashMap();
        map1.put("attractions",attractions);
        map1.put("page",page);
        //返回map集合
        return map1;
    }

    @GetMapping(value = "/star/{currentPage}")
    public Map getStarByPage(@PathVariable Integer currentPage){

        //当前页
        int currentPage1=currentPage;
        //当前页面大小
        int pageSize=6;
        //数据总条数
        int totalCount=attractionsService.getCount();
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
        List<Attractions> attractions=attractionsService.getStarByPage(map);
        //创建一个map集合存放需要创给前台的学生集合数据和Page对象
        Map map1=new HashMap();
        map1.put("attractions",attractions);
        map1.put("page",page);
        //返回map集合
        return map1;
    }

    @GetMapping(value = "/price/{currentPage}")
    public Map getByPrice(@PathVariable Integer currentPage) {

        //当前页
        int currentPage1 = currentPage;
        //当前页面大小
        int pageSize = 6;
        //数据总条数
        int totalCount = attractionsService.getCount();
        //声明创建page对象并传入需要的属性值
        Page page = new Page();
        page.setPageSize(pageSize);
        page.setTotalCount(totalCount);
        //对当前页进行边界判定
        if (currentPage1 <= 1) {
            currentPage1 = 1;
        } else if (currentPage1 >= page.getTotalPage()) {
            currentPage1 = page.getTotalPage();
        } else {
            currentPage1 = currentPage;
        }
        //把当前页传入page对象
        page.setCurrentPage(currentPage1);
        //创建一个map对象用户存放查询所需要的数据
        Map map = new HashMap();
        map.put("upTo", (currentPage1 - 1) * pageSize);
        map.put("pageSize", pageSize);
        List<Attractions> attractions = attractionsService.getPriceByPage(map);
        //创建一个map集合存放需要创给前台的学生集合数据和Page对象
        Map map1 = new HashMap();
        map1.put("attractions", attractions);
        map1.put("page", page);
        //返回map集合
        return map1;
    }

    //增删改
    @DeleteMapping(value = "/{attId}")
    public int delById(@PathVariable int attId){
        return attractionsService.deleteByPrimaryKey(attId);
    }


    @PutMapping(value = "")
    public int modifyAttraction(@RequestBody Attractions attractions){
        return attractionsService.updateByPrimaryKey(attractions);
    }

    @PostMapping(value = "")
    public int addAttraction(@RequestBody Attractions attractions){
        return attractionsService.insert(attractions);
    }


}
