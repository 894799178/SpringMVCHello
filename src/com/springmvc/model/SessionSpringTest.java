package com.springmvc.model;

import com.springmvc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * 该类演示了@SessionAttribues注释的使用
 *
 */
//@Controller
/**注释表示将Request中的属性是user的对象添加到Session域中
 * 该注释只能声明在类上方.
 *
 * */

//@SessionAttributes("user")
public class SessionSpringTest {
    @RequestMapping( value = "/login")
    public String sessionTest(@RequestPart("name") String name, @RequestParam("password") String password, Model model) {
        System.out.println("SessionTest被调用");
        User user = new User();
        user.setUserName(name);
        user.setPassword(password);
        model.addAttribute("user",user);
        System.out.println(model.asMap().get("user"));
        return "SessionHello";


    }
}
