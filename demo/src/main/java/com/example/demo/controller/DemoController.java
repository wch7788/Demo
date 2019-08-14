package com.example.demo.controller;

import com.example.demo.ResultUtil;
import com.example.demo.bean.Result;
import com.example.demo.bean.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {

    @GetMapping("/demo")
    public Result<User> getDemo() {
        User user = new User("admin","password");
        return ResultUtil.success(user);
    }
}
