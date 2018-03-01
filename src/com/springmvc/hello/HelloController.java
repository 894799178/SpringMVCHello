package com.springmvc.hello;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * HelloController 是一个Controller接口的控制器
 * 可以处理单一的请求动作.
 */
public class HelloController implements Controller {
    private static final Log logger = LogFactory.getLog(HelloController.class);
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        logger.info("handleRequest被调用");
          ModelAndView modelAndView=new ModelAndView();
          modelAndView.addObject("message","helloWorld");
          //设置逻辑视图名,视图解析器会根据该名字解析到具体的视图页面.
          modelAndView.setViewName("/WEB-INF/Page/hello.jsp");
        return modelAndView;
    }
}
