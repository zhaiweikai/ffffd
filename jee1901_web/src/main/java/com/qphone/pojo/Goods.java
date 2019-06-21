package com.qphone.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Scanner;


@Data
public class Goods {
    private BigDecimal foodId;  //商品id

    private String foodName;   //商品名字

    private String foodPrice;  //商品价格

    private Date foodDate;   //发起时间

    private String foodAllprice;  //总金额

    private String foodNum;  //购买人数

    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        String pass=sc.next();
        System.out.println("2222222");
        System.out.println("zs");
    }*/

    }
