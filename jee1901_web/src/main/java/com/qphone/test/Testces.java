package com.qphone.test;

import com.qphone.service.GoodsService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class Testces {
    @Autowired
    private GoodsService goodsservice;
    @Test
    public  void  tests(){
        goodsservice.selectAll();

          System.out.println("");


    }
}
