package com.example.jyx.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController

public class Login {
    @RequestMapping(value = "/login" , method = RequestMethod.GET)
    public ModelAndView userLog(){
        ModelAndView mv = new ModelAndView("/login");
        return mv;
    }
    @RequestMapping(value = "/submit",method = RequestMethod.POST)
    public String submitLog(@RequestParam("username")String user, @RequestParam("password")String password){
        if ((user.equals("jyx")) && (password.equals("123456"))){
            return "successful";
        }
        return "failed";
    }
}
