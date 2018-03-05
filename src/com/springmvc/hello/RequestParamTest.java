package com.springmvc.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class RequestParamTest {
    /**
     * @RequestParam 注释的使用.
     * @param userName
     */
    @RequestMapping("/hello")
    public void test(@RequestParam(value="userName" ,required = false) String userName){
        System.out.println("test");
        System.out.println("UserName:" + userName);
    }
}
