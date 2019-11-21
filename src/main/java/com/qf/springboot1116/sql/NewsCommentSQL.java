package com.qf.springboot1116.sql;

import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

//生产mybatis注解需要的sql语句
public class NewsCommentSQL {

//    public String findCount(Map<String,Object> param){
//        String sql="select count(0) from news_comment";
//        if(param!=null&&param.get("newsid")!=null){
//        sql+=" where newsid=#{newsid}";
//        }
//        return sql;
//    }
        public String findCount(Map<String,Object> param){
            return new SQL(){
                {
                    SELECT("count(0)");
                    FROM("news_comment");
                    if(param!=null&&param.get("newsid")!=null){
                        WHERE("newsid=#{newsid}");
                    }
                }
            }.toString();
        }
}
