package com.qf.springboot1116.mapper;

import com.qf.springboot1116.Springboot1116ApplicationTests;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

class CommentMapperTest extends Springboot1116ApplicationTests {

    @Resource CommentMapper commentMapper;
    @Test
    void findCount() {
        System.out.println(commentMapper.findCount(9L));
    }
}