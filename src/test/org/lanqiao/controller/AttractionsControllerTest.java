package org.lanqiao.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lanqiao.bean.Attractions;
import org.lanqiao.dao.AttractionsMapper;
import org.lanqiao.service.IAttractionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.swing.*;

import static org.junit.Assert.*;

/**
 * @ProjectName SSMProject
 * @Package org.lanqiao.controller
 * @Date 2020/1/8 16:20
 * @Author pw
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class AttractionsControllerTest {

    @Autowired
    AttractionsMapper attractionsMapper;

    @Test
    public void modifyAttraction() {

        Attractions attractions = new Attractions();
        attractions.setAttName("故宫博物馆");
        attractions.setAttId(2);
        System.out.println(attractionsMapper.updateByPrimaryKeySelective(attractions));
    }
}