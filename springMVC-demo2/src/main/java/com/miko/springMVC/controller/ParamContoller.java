package com.miko.springMVC.controller;

import com.miko.springMVC.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;

@Controller
public class ParamContoller {
    @RequestMapping("/testServletAPI")
    //形参request的表当前请求
    public String testServletAPI(HttpServletRequest request){
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username"+username+"password:"+password);
        return "success";
    }

    @RequestMapping("/testParam")
    public String testparam(
            @RequestParam(value = "user_name",required = false) String username,
            String password,
            String[] hobby,
            @RequestHeader(value = "Host",required = true,defaultValue = "8080")String host,
            @CookieValue(value = "JSESSIONID",required = false,defaultValue = "cookie")String JESSIONID){
        System.out.println("username"+username+"password:"+password+"hobby:"+ Arrays.toString(hobby));
        System.out.println("host:"+host);
        System.out.println("JSESSIONID:"+JESSIONID);
        return "success";
    }
    @RequestMapping("/testBean")
    public  String testBean(User user){
        System.out.println("user:"+user);
        return "success";
    }
}
