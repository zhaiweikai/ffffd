package com.qphone.service.Impl;

import com.qphone.dao.CrowdMapper;
import com.qphone.pojo.Crowd;
import com.qphone.service.CrowdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("/crowdService")
public class  CrowdServiceImpl implements CrowdService {
  //alt+回车 就可以出来
    @Autowired
    private CrowdMapper crowdMapper;



    @Override
    public List<Crowd> selectAll() {


        return crowdMapper.selectAll();
    }
}

