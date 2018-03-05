package com.springmvc.hello;




import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * AnnotationForHelloController 是通过注释类型来声明控制器
 * 可以处理单一的请求动作.
 * 测试所用的配置文件 SpringMVC-Conifg2.xml
 */
//@Controller
public class AnnotationForHelloController {
    private static final Log logger = LogFactory.getLog(AnnotationForHelloController.class);

    /**
     *使用RequestMapping注解来映射handleRequest方法
     * @param httpServletRequest
     * @param httpServletResponse
     * @return
     * @throws Exception
     */
   // @RequestMapping(value="/hello1")
    public ModelAndView hello1(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        logger.info("handleRequest被调用");
          ModelAndView modelAndView=new ModelAndView();
          modelAndView.addObject("message","helloWorld");
          //设置逻辑视图名,视图解析器会根据该名字解析到具体的视图页面.
          modelAndView.setViewName("/WEB-INF/Page/hello.jsp");
        return modelAndView;
    }
}
