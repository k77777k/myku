package com.qf.springboot1116.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;

@Configuration
public class TestConfig {
//    <bean id="xxx" class = "DispatcherServlet"/>
    @Bean
    public DispatcherServlet xxx(){
        DispatcherServlet dispatcherServlet =  new DispatcherServlet();
        dispatcherServlet.setContextId("xxx");
        return dispatcherServlet;
    }
}
