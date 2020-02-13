package org.lanqiao.controller;

import org.lanqiao.bean.Reservation;
import org.lanqiao.service.IReservationService;
import org.lanqiao.service.impl.ReservationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/reservation")
public class ReservationController {
    @Autowired
    IReservationService reservationService;
    @GetMapping(value ="")
    public List<Reservation> getAllReservation(){
        return  reservationService.getAllReservation();
    }
    @PutMapping(value ="/{resId}")
    public  Reservation  selectResById(@PathVariable Integer resId){
        return  reservationService.selectByPrimaryKey(resId);
    }
    @GetMapping(value = "/cond")
    public  List<Reservation> getResByCond( Reservation reservation){
        return   reservationService.selectReservationByCondition(reservation);
    }
}
