package com.miko.mvc.controller;

import com.miko.mvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HttpController {
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String requestBody){
        System.out.println("requestbody:"+requestBody);
        return "success";
    }
    //@RequestMapping("/testRequestEntity")
    //public String testRequestEntity()


    @RequestMapping("/testResponseUser")
    @ResponseBody
    public User testResponseUser(){
        return new User(1001,"admin","123456",24,"男");
    }

    @RequestMapping("/testAxios")
    @ResponseBody
    public String textAxios(String username,String password){
        System.out.println(username+","+password);
        return "hello,ajax";
    }
}
