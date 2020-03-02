package com.csyaonie.config;

import com.csyaonie.filter.ShiroFilter;
import com.csyaonie.listener.MyListener;
import com.csyaonie.servlet.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @author zyf
 * @date 2020/3/2
 * @description
 */
@Configuration
public class ServerConfig {

    @Bean
    public ServletListenerRegistrationBean myListener(){
        ServletListenerRegistrationBean servletListenerRegistrationBean=new ServletListenerRegistrationBean(new MyListener());
        return servletListenerRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean shiroFilter(){
        FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean(new ShiroFilter());
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));
        return filterRegistrationBean;
    }

    @Bean
    public ServletRegistrationBean myServlet(){
        ServletRegistrationBean servletRegistrationBean=new ServletRegistrationBean(new MyServlet(),"/helloservlet");
        servletRegistrationBean.setLoadOnStartup(1);
        return servletRegistrationBean;
    }

}
