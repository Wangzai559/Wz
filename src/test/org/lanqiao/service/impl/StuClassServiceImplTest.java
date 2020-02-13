package org.lanqiao.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lanqiao.dao.StuClassMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @ProjectName SSMProject
 * @Package org.lanqiao.service.impl
 * @Date 2020/2/3 14:58
 * @Author pw
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class StuClassServiceImplTest {

    @Autowired
    StuClassMapper stuClassMapper;
    @Test
    public void selectByPrimaryKey() {
        System.out.println(stuClassMapper.selectByPrimaryKey(3));
    }
}