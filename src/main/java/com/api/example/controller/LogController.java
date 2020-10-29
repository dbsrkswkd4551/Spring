package com.api.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/lo")
    public ModelAndView lo() throws Exception{
        ModelAndView mav = new ModelAndView();

        logger.trace("Trace Level 테스트");
        logger.debug("DEBUG Level 테스트");
        logger.info("Info level 테스트");
        logger.warn("Warn level 테스트");
        logger.error("Error level 테스트");

        return mav;
    }
}
