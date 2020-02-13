package org.lanqiao.bean;

import lombok.Data;
import lombok.ToString;

import java.sql.Date;

/**
 * @Author pw
 * @Date 2019/10/31
 * @Time 9:53
 */

@Data
@ToString
public class BlogDto {

    private  Integer magId;
    private String blogTitle;
    private  String blogSort;
    private  String magName;
    private String blogImg;
    private Date magDate;
    private String magContent;


}
