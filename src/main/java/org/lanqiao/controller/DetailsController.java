package org.lanqiao.controller;

import org.lanqiao.bean.Details;
import org.lanqiao.service.IDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/details")
public class DetailsController {
    @Autowired
    IDetailsService detailsService;

    /**
     * 查询所有旅客信息
     * @return
     */
    @GetMapping(value="")
    public List<Details> getAllDetails(){

       return  detailsService.getAllDetails();
    }

    /**
     * 添加旅客信息
     * @param details
     * @return
     */

    @PostMapping(value ="")
    public  int insertDetails(@RequestBody Details details){
        System.out.println("111111111111111111111111111111");
        System.out.println(details);
        return  detailsService.insertSelective(details);
    }

    @DeleteMapping(value = "/{detId}")
    public  int deleteByPrimaryKey(@PathVariable Integer detId){
        return  detailsService.deleteByPrimaryKey(detId);
    }
    @PutMapping(value ="")
    public int  updateByPrimaryKeySelective(@RequestBody Details details){
        return  detailsService.updateByPrimaryKeySelective(details);
    }
}
