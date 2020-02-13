package org.lanqiao.bean;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@ToString
public class AllAttractions {
    private Integer allId;

    private String allName;

    private String allImg;

    private String allRegion;

    private String allSite;

    private String allDesc;

    private Integer allPrice;

    private BigDecimal allStar;

}