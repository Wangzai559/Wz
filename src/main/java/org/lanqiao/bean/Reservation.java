package org.lanqiao.bean;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Reservation {
    private Integer resId;

    private String attName;

    private Integer attId;

    private Integer userId;

    private String resPrice;

    private String resStartDate;

    private String resEndDate;

    private String resStartWeek;

    private String resEndWeek;

    private Integer resLeftSeats;

}