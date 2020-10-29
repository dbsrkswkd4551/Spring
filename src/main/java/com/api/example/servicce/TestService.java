package com.api.example.servicce;

import com.api.example.domain.TestVo;
import com.api.example.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    public TestMapper mapper;

    public List<TestVo> selectTest(){
        return mapper.list();
    }
}
