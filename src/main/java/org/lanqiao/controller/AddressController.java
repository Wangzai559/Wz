package org.lanqiao.controller;

import org.lanqiao.bean.Address;
import org.lanqiao.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/address")
public class AddressController {
   @Autowired
    IAddressService addressService;

   @GetMapping(value = "/{addId}")
   public Address selectByPrimaryKey(@PathVariable Integer addId){
             return  addressService.selectByPrimaryKey(addId);
   }

   @GetMapping(value ="")
    public List<Address> getAllAddress(){
       return  addressService.getAllAddress();
   }
}
