package com.csyaonie.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//配置静态资源访问路径 这里的配置相当于累加 不是覆盖
@Configuration
public class StaticConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        super.addResourceHandlers(registry);
        registry.addResourceHandler("/mypublic/**").addResourceLocations("classpath:/mystatic/");
    }
}
