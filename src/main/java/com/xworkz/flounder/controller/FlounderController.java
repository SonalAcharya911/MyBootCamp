package com.xworkz.flounder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class FlounderController {

    public FlounderController(){
        System.out.println("created FlounderController.");
    }
    @RequestMapping("/send")
    public String onSend(){
        System.out.println("running onSend in FlounderController...");
        return "index.jsp";
    }
}
