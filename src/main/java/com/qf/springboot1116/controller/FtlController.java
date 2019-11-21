package com.qf.springboot1116.controller;

import com.qf.springboot1116.mapper.NewsDetailMapper;
import com.qf.springboot1116.pojo.NewsDetail;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class FtlController {


    @Resource
    private NewsDetailMapper newsDetailMapper;
    @RequestMapping("/index")
    public String index(Model model){
        List<NewsDetail> all = newsDetailMapper.selectAll();
        model.addAttribute("all", all);
        model.addAttribute("name", "张三");
        System.out.println("嘿嘿嘿");
        return "index";
    }
}
