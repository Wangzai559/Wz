package org.lanqiao.bean;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Role {
    private Integer roleId;

    private String roleName;

    private String rolePass;


}