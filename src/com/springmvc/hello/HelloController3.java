package com.springmvc.hello;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * HelloController2 是通过注释类型来声明控制器
 * 可以处理单一的请求动作.
 */
@Controller
public class HelloController3 {
    private static final Log logger = LogFactory.getLog(HelloController3.class);
    /**
     *使用RequestMapping注解来映射handleRequest方法
     * @param httpServletRequest
     * @param httpServletResponse
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/hello")
    public ModelAndView hello2(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        logger.info("handleRequest被调用");
          ModelAndView modelAndView=new ModelAndView();
          modelAndView.addObject("message","helloWorld");
        return modelAndView;
    }
}
