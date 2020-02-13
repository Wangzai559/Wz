package org.lanqiao.service.impl;

import org.lanqiao.bean.Reservation;
import org.lanqiao.dao.ReservationMapper;
import org.lanqiao.service.IReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements IReservationService {
    @Autowired
    ReservationMapper reservationMapper;
    @Override
    public int deleteByPrimaryKey(Integer resId) {
        return reservationMapper.deleteByPrimaryKey(resId);
    }

    @Override
    public int insert(Reservation record) {
        return reservationMapper.insert(record);
    }

    @Override
    public int insertSelective(Reservation record) {
        return reservationMapper.insertSelective(record);
    }

    @Override
    public Reservation selectByPrimaryKey(Integer resId) {
        return reservationMapper.selectByPrimaryKey(resId);
    }

    @Override
    public int updateByPrimaryKeySelective(Reservation record) {
        return reservationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Reservation record) {
        return reservationMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Reservation> getAllReservation() {
        return reservationMapper.getAllReservation();
    }

    /**
     * 根据条件查询用户信息
     * @param reservation
     * @return
     */
    @Override
    public List<Reservation> selectReservationByCondition(Reservation reservation) {
        return reservationMapper.selectReservationByCondition(reservation);
    }


}
