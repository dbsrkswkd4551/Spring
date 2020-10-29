package com.api.example.controller;

import com.api.example.domain.TestVo;
import com.api.example.servicce.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    TestService service;

    @RequestMapping(value = "/test")
    public ModelAndView test() throws Exception{
        List<TestVo> testList = service.selectTest();

        ModelAndView mav = new ModelAndView("test");
        mav.addObject("name", "윤근상");
        mav.addObject("list", testList);

        return mav;
    }
}
