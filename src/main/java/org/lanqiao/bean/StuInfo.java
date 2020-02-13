package org.lanqiao.bean;

import lombok.Data;
import lombok.ToString;

import java.util.Date;


@Data
@ToString
public class StuInfo {
    private Integer stuId;

    private String stuName;

    private String stuSex;

    private Date stuBirth;

    private String politicsStatus;

    private String birthPlace;

}