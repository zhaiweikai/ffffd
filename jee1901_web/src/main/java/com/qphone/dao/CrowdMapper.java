package com.qphone.dao;

import com.qphone.pojo.Crowd;
import com.qphone.pojo.CrowdExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrowdMapper {
    long countByExample(CrowdExample example);

    int deleteByExample(CrowdExample example);

    int deleteByPrimaryKey(BigDecimal crowdId);

    int insert(Crowd record);

    int insertSelective(Crowd record);

    List<Crowd> selectByExample(CrowdExample example);


    public  List<Crowd> selectAll();
}