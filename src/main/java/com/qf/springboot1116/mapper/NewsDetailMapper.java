package com.qf.springboot1116.mapper;

import com.qf.springboot1116.pojo.NewsDetail;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

//新闻描述表对应的接口
public interface NewsDetailMapper extends Mapper<NewsDetail> {

    //查询数据总条数
    Long findCount();
    //查询所有数据
    List<NewsDetail> findAll();
}
