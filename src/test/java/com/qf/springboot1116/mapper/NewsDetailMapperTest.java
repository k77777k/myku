package com.qf.springboot1116.mapper;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.springboot1116.Springboot1116ApplicationTests;
import com.qf.springboot1116.pojo.NewsDetail;
import org.junit.jupiter.api.Test;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

class NewsDetailMapperTest extends Springboot1116ApplicationTests {

    @Resource
    private NewsDetailMapper newsDetailMapper;


    @Test
    void add(){
        NewsDetail newsDetail = new NewsDetail();
        newsDetail.setTitle("剑指S10");
        newsDetail.setAuthor("UZI");
        newsDetail.setSummary("剑指队，一指指到S10");
        int insert = newsDetailMapper.insert(newsDetail);
        System.out.println(insert);
    }

    //创建example对象，并对Example中的静态内部类Criteria进行操作
    @Test
    void findByExcemple(){
        Example example = new Example(NewsDetail.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andGreaterThan("id", 5);
        criteria.andLike("summary", "%的%");
        List<NewsDetail> example1 = newsDetailMapper.selectByExample(example);
        for (NewsDetail newsDetail : example1) {
            System.out.println(newsDetail.toString());
        }
    }
    @Test
    void findCount() {
        Long count = newsDetailMapper.findCount();
        System.out.println(count);
    }
    @Test
    void findAll(){
        //分页助手
        PageHelper.startPage(1, 4);
        List<NewsDetail> newsDetails = newsDetailMapper.selectAll();
        PageInfo<NewsDetail> pageInfo = new PageInfo<>(newsDetails);
        for (NewsDetail newsDetail : pageInfo.getList()) {
            System.out.println(newsDetail);
        }
        System.out.println(pageInfo);
    }
    @Test
    void select() {
        NewsDetail newsDetail = new NewsDetail();
        newsDetail.setAuthor("日向斑");
        newsDetail.setTitle("1111");
        List<NewsDetail> select = newsDetailMapper.select(newsDetail);
        for (NewsDetail detail : select) {
            System.out.println(detail);

        }
    }
    @Test
    void selectById(){
        NewsDetail newsDetail = newsDetailMapper.selectByPrimaryKey(1L);
        System.out.println(newsDetail);
    }
}