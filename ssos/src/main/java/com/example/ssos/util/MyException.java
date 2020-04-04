package com.example.ssos.util;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class MyException implements HandlerExceptionResolver {

    //全局的异常处理
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest,
                                         HttpServletResponse httpServletResponse,
                                         Object o, Exception e) {
//      将异常输出到控制台
        HandlerMethod hm = (HandlerMethod) o;
        System.out.println("异常信息:"+e.getMessage());
        System.out.println("发生异常的类:"+hm.getBean()+"/"+hm.getMethod());

        ModelAndView mv = new ModelAndView("error");
        mv.addObject("errorInfo",StringUtil.ERRORINFO);
        return mv;
    }
}
