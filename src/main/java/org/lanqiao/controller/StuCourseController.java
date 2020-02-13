package org.lanqiao.controller;

import org.lanqiao.bean.StuCourse;
import org.lanqiao.service.IStuCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

/**
 * @ProjectName SSMProject
 * @Package org.lanqiao.controller
 * @Date 2020/2/3 11:19
 * @Author pw
 */
@RestController
@RequestMapping("api/course")
public class StuCourseController {
    @Autowired
    IStuCourseService stuCourseService;

    @GetMapping(value = "/{courseId}")
    public StuCourse findCourseById(@PathVariable Integer courseId){
        return stuCourseService.selectByPrimaryKey(courseId);
    }

    @GetMapping("/all")
    public List<StuCourse> findAll(){
        return stuCourseService.selectAllCourse();
    }
}
