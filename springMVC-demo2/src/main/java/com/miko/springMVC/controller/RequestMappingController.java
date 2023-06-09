package com.miko.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//RequestMapping("/hello")
public class RequestMappingController {

    @RequestMapping(
            value={"/testRequestMapping","/test"},
            method = {RequestMethod.GET,RequestMethod.POST}
    )
    public String success(){
        return "success";
    }

    @GetMapping("/testGetMapping")
    public String testGetMapping(){
        return "success";

    }

    @RequestMapping(value = "/testPut",method = RequestMethod.PUT)
    public String testPost(){
        return "success";
    }

    //@RequestMapping("/a?a/testAnt")
    //@RequestMapping("/a*a/testAnt")
    @RequestMapping("/**/testAnt")

    public String testAnt(){
        return "success";
    }
//pathvariable对参数的引用。在springmvc框架中属于少用的方法
    @RequestMapping("/testPath/{id}")
    public String testPath(@PathVariable("id")Integer id){
        System.out.println("id:"+id);
        return "success";
    }
}
