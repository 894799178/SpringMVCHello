package com.springmvc.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ModelAttributeTest {
    //动态页面跳转
    @RequestMapping(value ="/ModelTestPage/{formName}")
    public String gotoPage(@PathVariable("formName") String formName){
        System.out.println("gotoPage方法被调用formName:"+formName);
        return formName;
    }
    @ModelAttribute("name")
    public String ModelTest(@RequestParam("name") String name){
        System.out.println("ModelTest方法被调用name:"+name);
     return name;
    }
    @RequestMapping("/ModelTestPage/login1")
    public String login1(){
        System.out.println("login1---->被执行");
        return "result1";
    }
}
