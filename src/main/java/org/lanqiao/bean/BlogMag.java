package org.lanqiao.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;

import java.util.Date;


@Data
@ToString
public class BlogMag {
    private Integer magId;

    private String magName;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date magDate;

    private String userEmail;

    private Integer userId;

    private String magContent;

    private Integer blogId;


}