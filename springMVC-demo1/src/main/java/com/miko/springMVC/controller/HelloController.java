package com.miko.springMVC.controller;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController  {
    @RequestMapping( "/")
    public String index(){
        //返回视图名称
        return "index";
    }
    @RequestMapping("/target")
    public String toTarget(){
        return "target";
    }
}
