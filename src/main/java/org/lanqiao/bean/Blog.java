package org.lanqiao.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;


@Data
@ToString
public class Blog {
    private Integer blogId;

    private String blogTitle;

    private String blogSort;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date blogDate;

    private String blogContents;

    private String blogImg;

    private String blogAuther;

    private Integer blogSumMag;

    private  String blogAutherInfo;

    private String blogAutherPhoto;

//    private List<BlogMag> blogMagList;
}
