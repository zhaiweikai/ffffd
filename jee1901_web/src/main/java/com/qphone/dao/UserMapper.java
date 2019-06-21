package com.qphone.dao;

import com.qphone.pojo.User;
import com.qphone.pojo.UserExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(BigDecimal userId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(BigDecimal userId);

    public User  selectAll(String name);
}