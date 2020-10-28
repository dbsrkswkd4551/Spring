package com.api.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "index.html";
    }

    @RequestMapping("/data")
    @ResponseBody
    public String data(){
        String value = "hello data";
        return value;
    }

}
