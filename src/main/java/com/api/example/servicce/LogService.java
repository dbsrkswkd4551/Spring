package com.api.example.servicce;

import com.api.example.domain.TestVo;
import com.api.example.mapper.TestMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public TestMapper mapper;

    public List<TestVo>  selectTest(){
        logger.trace("Trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        return mapper.list();
    }
}
