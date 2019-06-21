package com.qphone.controller;

import com.alibaba.druid.util.StringUtils;
import com.github.pagehelper.util.StringUtil;
import com.qphone.pojo.SessionKey;
import com.qphone.pojo.User;
import com.qphone.service.UserService;
import com.qphone.utils.MD5;
import com.qphone.utils.ResultMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.Request;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/loginCheck")
    @ResponseBody
    public  String  loginCheck(HttpServletRequest request,User user){
        System.out.println("+++++++++++++");
        String name=request.getParameter("name");
        String pass=request.getParameter("pass");
        System.out.println("name");
        System.out.println("pass");
      return null;
    }
}
