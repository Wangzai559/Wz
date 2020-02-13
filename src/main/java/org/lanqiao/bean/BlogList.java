package org.lanqiao.bean;


import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class BlogList {
    private List<Blog> blogList;
}
