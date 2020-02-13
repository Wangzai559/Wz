package org.lanqiao.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;

import java.util.Date;
@Data
@ToString
public class Orders {
    private Integer ordId;     //订单id

    private String attName;     //景点名字

    private Integer attId;        //景点id

    private Integer userId;           //用户id

    private Integer ordPrice;          //订单价格

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date ordDate;       //订单创建时间

    private String ordNum;      //订单号

}