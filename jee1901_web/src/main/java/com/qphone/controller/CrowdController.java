package com.qphone.controller;

import com.qphone.pojo.Crowd;
import com.qphone.service.CrowdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CrowdController {

    @Autowired
    private CrowdService crowdService;

    @RequestMapping(value = "/crd/project")
    public ModelAndView   select(){

        List<Crowd> list=crowdService.selectAll();
        System.out.println(list);
        ModelAndView re=new ModelAndView("project");//去往具体的页面
        re.addObject("list" ,list);   //这个值   "lsit"是字符串  list 是对象
         System.out.println("+++++++");
        return re;
    }
    @RequestMapping(value = "/crd/pay-step-1")
    public ModelAndView   selectAll(){

        List<Crowd> cod=crowdService.selectAll();
        System.out.println(cod);
        ModelAndView re=new ModelAndView("pay-step-1");//去往具体的页面
        re.addObject("cod" ,cod);   //这个值   "lsit"是字符串  list 是对象
        System.out.println("+++++++");
        return re;
    }

}
