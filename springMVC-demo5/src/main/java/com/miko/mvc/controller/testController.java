package com.miko.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {
    @RequestMapping("/**/testInterceptor")
    public String testInterceptor(){
    return "success";
    }
}