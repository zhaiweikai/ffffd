package com.qphone.controller;

import com.qphone.pojo.Goods;
import com.qphone.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class goodsController {
      @Autowired
    private GoodsService goodsService;

      @RequestMapping("/crd/index")
     public ModelAndView selectAll(){

         List<Goods> list =goodsService.selectAll();
          System.out.println(list);
          ModelAndView  re=new ModelAndView("index");//去往具体的页面
          re.addObject("list",list);//这个值   "lsit"是字符串  list 是对象
          System.out.println("+++++++++++++");
            return re;
     }
}
