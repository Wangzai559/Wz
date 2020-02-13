package org.lanqiao.service;

import org.lanqiao.bean.Reservation;

import java.util.List;

public interface IReservationService {
    int deleteByPrimaryKey(Integer resId);

    int insert(Reservation record);

    int insertSelective(Reservation record);

    Reservation selectByPrimaryKey(Integer resId);

    int updateByPrimaryKeySelective(Reservation record);

    int updateByPrimaryKey(Reservation record);
    /**
     * 查询所有预订订单信息
     * @return
     */
    List<Reservation> getAllReservation();

    /**
     * 根据条件查询用户信息
     * @param Reservation
     * @return
     */
    List<Reservation> selectReservationByCondition(Reservation Reservation);
}
