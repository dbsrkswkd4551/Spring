package com.api.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {

    @RequestMapping(value = "/testValue", method = RequestMethod.GET)
    public String getTestValue(){
        String TestValue = "레스트컨트롤러 테스트";
        return TestValue;
    }

}
