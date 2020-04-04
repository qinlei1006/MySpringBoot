package com.example.ssos.confi;

import com.example.ssos.util.MyInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class MyWebConfiguer implements WebMvcConfigurer {

    //拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(new MyInterceptor()) // 放入自定义拦截器
                .addPathPatterns("/**") //拦截所有
                .excludePathPatterns("/getAddUser","/static/**");//放行的地址
    }

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
