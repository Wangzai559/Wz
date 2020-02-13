package org.lanqiao.controller;

import org.lanqiao.bean.Academy;
import org.lanqiao.bean.StuInfo;
import org.lanqiao.service.IAcademyService;
import org.lanqiao.service.IStuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ProjectName SSMProject
 * @Package org.lanqiao.dao
 * @Date 2020/1/9 10:48
 * @Author pw
 */

@Controller
@RequestMapping("api/academy")
public class AcademyController {

    @Autowired
     IAcademyService academyService;


    @PostMapping ("/add")
    public int insertAcademy(@RequestBody Academy academy){
        return academyService.insert(academy);
    }

    @PostMapping("/del/{academyId}")
    public int delAcademyById(@PathVariable Integer academyId){
        return academyService.deleteByPrimaryKey(academyId);
    }

    @PutMapping("/update")
    public int updateAcademy(@RequestBody Academy academy){
        return academyService.updateByPrimaryKeySelective(academy);
    }

    @GetMapping("/find/{academyId}")
    public Academy selectAcademyById(@PathVariable Integer academyId){
        return academyService.selectByPrimaryKey(academyId);
    }

    @GetMapping("/all")
    public List<Academy> getAllAcademy(){
        return academyService.findAllAcademy();
    }
}
