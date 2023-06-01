package com.miko.mvc.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Excptioncontroller {

    @ExceptionHandler(value = {ArithmeticException.class,NullPointerException.class})
    public String testException(Exception ex, Model model){
        model.addAttribute("ex",ex);
        return "error";
    }
}
