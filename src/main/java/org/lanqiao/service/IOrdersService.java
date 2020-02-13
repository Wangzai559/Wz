package org.lanqiao.service;

import org.lanqiao.bean.Orders;

import java.util.List;
import java.util.Map;

public interface IOrdersService {

    /**
     * 查询所有订单
     * @return
     */
    List<Orders> selectAllOrderByPage(Map map);

    /**
     * 查询总条数
     * @return
     */
    int selectAllCount();

    /**
     * 根据id删除信息
     * @param ordId
     * @return
     */
    int deleteByPrimaryKey(Integer ordId);

    /**
     * 订单量
     * @return
     */
    int getCountOrderId();

    /**
     * 交易额
     * @return
     */
    int getSumOrderPrice();


    List<Orders> getOrderByPage(Map map);

}
