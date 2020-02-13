package org.lanqiao.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lanqiao.service.IAcademyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @ProjectName SSMProject
 * @Package org.lanqiao.controller
 * @Date 2020/1/11 14:00
 * @Author pw
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class AcademyControllerTest {

    @Autowired
    private IAcademyService academyService;

    @Test
    public void getAllAcademy() {
        System.out.println(academyService.findAllAcademy());
    }
}