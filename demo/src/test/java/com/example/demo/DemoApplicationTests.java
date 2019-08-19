package com.example.demo;

import com.example.demo.bean.User;
import com.example.demo.mapper.mapper1.DemoMapper;
import com.example.demo.mapper.mapper2.StudentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private DemoMapper demoMapper;


    @Test
    public void contextLoads() {
        String str = studentMapper.findById(1);
        System.out.println(str);
        User user = demoMapper.findUser(1);
        System.out.println(user.getUsername());
    }

}
