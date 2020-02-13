package org.lanqiao.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lanqiao.bean.StuInfo;
import org.lanqiao.dao.StuInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @ProjectName SSMProject
 * @Package org.lanqiao.service.impl
 * @Date 2020/1/8 11:21
 * @Author pw
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class StuInfoServiceImplTest {

    @Autowired
    StuInfoMapper stuInfoMapper;

    @Test
    public void findAll() {
        List<StuInfo> stuInfos = stuInfoMapper.selectAll();
        for (StuInfo stu:stuInfos) {
            System.out.println(stu.toString());
        }
    }


    @Test
    public void getStuByStuId() {
        System.out.println(stuInfoMapper.selectByPrimaryKey(2016341408));
    }

    @Test
    public void delStuInfoByStuId() {
        System.out.println(stuInfoMapper.deleteByPrimaryKey(2016341408));
    }

    @Test
    public void updateStuInfo() {
        StuInfo stuInfo = new StuInfo();
        stuInfo.setStuId(2016341408);
        stuInfo.setBirthPlace("河南省信阳市潢川县");
        System.out.println(stuInfoMapper.updateByPrimaryKeySelective(stuInfo));
    }

    @Test
    public void insertStuInfo(){
        StuInfo stuInfo = new StuInfo();
        stuInfo.setStuId(2016341408);
        stuInfo.setStuSex("女");
        stuInfo.setPoliticsStatus("党员");
        stuInfo.setStuName("祁萌微");
        stuInfo.setBirthPlace("河南信阳");
        System.out.println(stuInfoMapper.insert(stuInfo));
    }
}