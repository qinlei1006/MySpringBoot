package com.example.ssos.confi;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class MyWebConfiguer implements WebMvcConfigurer {

    /**
     * 放行静态资源
     * @param registry
     */
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
     //放行的文件
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");
    }
}
