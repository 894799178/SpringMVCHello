package com.springmvc.model;

import com.springmvc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 该类用来测试Spring中的Model如何被传递的.
 * 对应测试的配置文件 SpringMVC-Config-Model.xml
 */

public class ModelTest {
    //通过@ModelAttribute 注释修饰的方法 会有先于@RequstMapping修饰的方法执行
    @ModelAttribute
    public void UserModel(String loginUserName,String password,Model model){
        System.out.println("UserModel!!!!");
        User user = new User();
        user.setUserName(loginUserName);
        user.setPassword(password);
        model.addAttribute(user);
    }
    @RequestMapping(value="/login1")
    public String login1 (Model model){
        User user  = (User) model.asMap().get("user");
        System.out.println(user);
        return "login";
    }
}
