package com.miko.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
//RequestMapping("/hello")
public class RequestMappingController {

    @RequestMapping(value={"/testRequestMapping","/test"})
    public String success(){
        return "success";
    }
}
