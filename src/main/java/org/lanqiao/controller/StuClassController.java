package org.lanqiao.controller;

import org.lanqiao.bean.StuClass;
import org.lanqiao.service.IStuClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ProjectName SSMProject
 * @Package org.lanqiao.controller
 * @Date 2020/2/3 11:15
 * @Author pw
 */
@RestController
@RequestMapping("api/class")
public class StuClassController {

    @Autowired
    private IStuClassService stuClassService;

    @DeleteMapping("/{classId}")
    public int delClassByClassId(@PathVariable Integer classId){
        return stuClassService.deleteByPrimaryKey(classId);
    }

    @PutMapping("/add")
    public int addClass(@RequestBody StuClass stuClass){
        return stuClassService.insert(stuClass);
    }

    @PostMapping("/modify")
    public int modifyClass(@RequestBody StuClass stuClass){
        return stuClassService.updateByPrimaryKeySelective(stuClass);
    }
    @GetMapping("/{classId}")
    public StuClass findClassByClassId(@PathVariable Integer classId){
        return stuClassService.selectByPrimaryKey(classId);
    }

    @GetMapping("/all")
    public List<StuClass> findAllClass(){
        return stuClassService.selectAllClass();
    }

}
