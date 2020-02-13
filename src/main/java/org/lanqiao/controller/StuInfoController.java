package org.lanqiao.controller;

import org.lanqiao.bean.StuInfo;
import org.lanqiao.service.IStuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @ProjectName SSMProject
 * @Package org.lanqiao.controller
 * @Date 2020/1/8 12:49
 * @Author pw
 */

@RestController
@RequestMapping("api/stuInfo")
public class StuInfoController {

    @Autowired
    IStuInfoService stuInfoService;

    @GetMapping("/show")
    public ModelAndView getInfo(){
        ModelAndView model = new ModelAndView();
        model.addObject("stuInfo",stuInfoService.findAll());
        model.setViewName("showStuInfo");
        return model;
    }

    @GetMapping("/all")
    public List<StuInfo> findAllStuInfo() {
        return stuInfoService.findAll();
    }


    @GetMapping(value = "/{stuId}")
    public StuInfo getStuInfoByStuId(@PathVariable Integer stuId) {
        return stuInfoService.getStuByStuId(stuId);
    }

    @PostMapping("/del/{stuId}")
    public int delStuInfo(@PathVariable Integer stuId) {
        return stuInfoService.delStuInfoByStuId(stuId);
    }

    @PutMapping("/update")
    public int modifyStuInfo(@RequestBody StuInfo stuInfo) {
        return stuInfoService.updateStuInfo(stuInfo);
    }

    @PutMapping("insert")
    public int insertStuInfo(@RequestBody StuInfo stuInfo){
        return stuInfoService.insertStuInfo(stuInfo);
    }
}
