package org.lanqiao.service.impl;

import org.lanqiao.bean.Address;
import org.lanqiao.dao.AddressMapper;
import org.lanqiao.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements IAddressService {
    @Autowired
    AddressMapper addressMapper;
    @Override
    public int deleteByPrimaryKey(Integer addId) {
        return addressMapper.deleteByPrimaryKey(addId);
    }

    @Override
    public int insert(Address record) {
        return  addressMapper.insert(record);
    }

    @Override
    public int insertSelective(Address record) {
        return addressMapper.insertSelective(record);
    }

    @Override
    public Address selectByPrimaryKey(Integer addId) {
        return  addressMapper.selectByPrimaryKey(addId);
    }

    @Override
    public int updateByPrimaryKeySelective(Address record) {
        return addressMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Address record) {
        return addressMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Address> getAllAddress() {
        return addressMapper.getAllAddress();
    }
}
