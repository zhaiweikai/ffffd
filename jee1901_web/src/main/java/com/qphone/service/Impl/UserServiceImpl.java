package com.qphone.service.Impl;

import com.qphone.dao.UserMapper;
import com.qphone.pojo.User;
import com.qphone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller("/userService")
public class UserServiceImpl  implements UserService {

    @Autowired
    private UserMapper  userMapper;

    @Override
    public User selectAll(String name) {
        return userMapper.selectAll(name);
    }
}
