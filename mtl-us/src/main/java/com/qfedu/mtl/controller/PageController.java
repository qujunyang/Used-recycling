package com.qfedu.mtl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/info.html")
    public String info(){
        return "info";
    }
    @RequestMapping("/login.html")
    public String login(){
        return "login";
    }

}
