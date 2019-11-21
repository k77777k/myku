package com.qf.springboot1116.mapper;

import com.qf.springboot1116.sql.NewsCommentSQL;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;

//新闻评论表
public interface CommentMapper {

    //查询总条数
    //@Select("select count(0) from news_comment")
    @SelectProvider(type = NewsCommentSQL.class,method = "findCount")
    Long findCount(@Param("newsid") Long newsid);
}
