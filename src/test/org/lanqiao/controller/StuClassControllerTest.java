package org.lanqiao.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lanqiao.service.IStuClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @ProjectName SSMProject
 * @Package org.lanqiao.controller
 * @Date 2020/2/3 14:54
 * @Author pw
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class StuClassControllerTest {

    @Autowired
    IStuClassService stuClassService;
    @Test
    public void findClassByClassId() {
    }
}