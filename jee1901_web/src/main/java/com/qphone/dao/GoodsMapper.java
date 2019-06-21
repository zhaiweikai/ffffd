package com.qphone.dao;

import com.qphone.pojo.Goods;

import java.util.List;

import org.springframework.stereotype.Repository;


public interface GoodsMapper {

    public List<Goods> selectAll();



}