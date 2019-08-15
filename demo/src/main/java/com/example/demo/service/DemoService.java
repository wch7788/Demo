package com.example.demo.service;

import com.example.demo.bean.User;

public interface DemoService {

    
    void getDemo() throws Exception;

    User findUser(int id);
}
