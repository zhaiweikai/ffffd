package com.qphone.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;
//alt+7查看当前类的所有方法
@NoArgsConstructor //空can
@ToString   //生成tostring
@Data        //生成get set  无参   缺一个有参构造器
@AllArgsConstructor   //全参，全部参数都有
public class Crowd {
    private BigDecimal crowdId; //项目编号

    private String crowdName;//项目名称

    private String crowdZj;  //众筹资金

    private String crowdCj; //筹集资金

    private Date crowdTime; //创建时间

    private String crowdDc; //达成率

    private String crowdMs; //项目描述信息

    private String crowdTt; //项目头图

    private String crowdXx; //项目详细图

    private String crowdFq;//发起人自我简介

    private String crowdJs;//详细介绍

    private String crowdPhoto;//联系电话

    private String crowdTel; //客服电话

    private String crowdZh;//收款账号

    private String crowdSf;//身份证




}