package org.lanqiao.service.impl;

import org.lanqiao.bean.Orders;
import org.lanqiao.dao.OrdersMapper;
import org.lanqiao.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class OrderServiceImpl implements IOrdersService {
    @Autowired
    OrdersMapper ordersMapper;

    @Override
    public List<Orders> selectAllOrderByPage(Map map) {
        return ordersMapper.selectAllOrderByPage(map);
    }

    @Override
    public int selectAllCount() {
        return ordersMapper.selectAllCount();
    }

    @Override
    public int deleteByPrimaryKey(Integer ordId) {
        return ordersMapper.deleteByPrimaryKey(ordId);
    }

    @Override
    public int getCountOrderId() {
        return ordersMapper.getCountOrderId();
    }

    @Override
    public int getSumOrderPrice() {
        return ordersMapper.getSumOrderPrice();
    }

    @Override
    public List<Orders> getOrderByPage(Map map) {
        return ordersMapper.getOrderByPage(map);
    }
}
