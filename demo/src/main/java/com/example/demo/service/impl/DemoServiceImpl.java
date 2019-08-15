package com.example.demo.service.impl;

import com.example.demo.bean.User;
import com.example.demo.exception.UserException;
import com.example.demo.mapper.DemoMapper;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoMapper demoMapper;


    @Override
    public void getDemo() throws Exception{
        if(true) {
            throw new UserException(500,"Error!****");
        }
    }

    @Override
    public User findUser(int id) {
        return demoMapper.findUser(id);
    }
}
