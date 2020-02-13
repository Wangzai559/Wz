package org.lanqiao.bean;

/**
 * @ProjectName SSMProject
 * @Package org.lanqiao.bean
 * @Date 2020/1/8 15:53
 * @Author pw
 */
public class test {
    public static void main(String[] args) {
        String str = "2016341418";
        String str2 =  str.substring(0,6);
        Integer sId =  Integer.parseInt(str.substring(0,8));
        System.out.println(str);
        System.out.println(str2);
        System.out.println(sId);
    }
}
