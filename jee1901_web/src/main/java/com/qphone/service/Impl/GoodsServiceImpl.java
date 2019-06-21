package com.qphone.service.Impl;

import com.qphone.dao.GoodsMapper;
import com.qphone.pojo.Goods;
import com.qphone.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("/goodsService")
public class GoodsServiceImpl implements GoodsService {

      @Autowired
      private GoodsMapper goodsMapper;
    @Override
    public List<Goods> selectAll(){

        return goodsMapper.selectAll();
    }
}
