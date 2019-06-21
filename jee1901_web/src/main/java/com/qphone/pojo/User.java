package com.qphone.pojo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class User {
    private BigDecimal userId;

    private String userName;

    private String userPass;

    private String userRealname;

    private String userEmail;

    private String userTel;


}