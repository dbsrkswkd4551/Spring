package com.api.example.controller;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    //화면에 helloworld가 출력된다
    @GetMapping(value = "/helloworld/string")
    @ResponseBody
    public String helloworldString(){
        return "helloworld";
    }

    //화면에 {messag:"helloworld"}라고 출력된다. 객체 return시 json형태
    @GetMapping(value = "/helloworld/json")
    @ResponseBody
    public Hello helloworldJson() {
        Hello hello = new Hello();
        hello.message = "helloworld";
        return hello;
    }

    //helloworld.ftl의 내용이 출력된다
    @GetMapping(value = "/helloworld/page")
    public String helloworld(){
        return "helloworld";
    }

    @Setter
    @Getter
    public static class Hello{
        private String message;
    }
}
