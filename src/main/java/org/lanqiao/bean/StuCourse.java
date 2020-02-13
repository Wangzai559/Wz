package org.lanqiao.bean;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class StuCourse {
    private Integer courseId;

    private String courseName;

    private Double courseGrade;

}