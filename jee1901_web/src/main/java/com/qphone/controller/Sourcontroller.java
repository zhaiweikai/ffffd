package com.qphone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crd")
public class Sourcontroller {

     //统配Controller
    @RequestMapping("/{url}")
    public String show(@PathVariable("url") String url){

        return url;
    }
    @RequestMapping("/{path1}/{path2}/{path3}")
    public  String show1(@PathVariable("path1")String path1,
                         @PathVariable("path2")String path2,
                         @PathVariable("path3")String path3){
        return path1+"/" + path2 + "/" +path3;
    }
    @RequestMapping("/{path1}/{path2}")
    public  String show2(@PathVariable("path1")String path1,
                         @PathVariable("path2")String path2){
        return path1  + "/" + path2;

    }
}
