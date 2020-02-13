package org.lanqiao.controller;

import org.lanqiao.bean.Administrator;
import org.lanqiao.service.IAdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author pw
 * @Date 2019/11/1
 * @Time 14:46
 */

@RestController
@RequestMapping(value = "api/admin")
public class AdministratorController {

    @Autowired
    IAdministratorService administratorService;

    @PostMapping("/user")
    public int checkUser(@RequestBody Administrator administrator){

        int res =  administratorService.getAdminByNameAndPass(administrator);
        return  res;
    }
}
