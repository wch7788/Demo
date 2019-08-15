package com.example.demo.controller;

import cn.hutool.http.HttpUtil;
import com.example.demo.ResultUtil;
import com.example.demo.bean.Result;
import com.example.demo.bean.User;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/demo")
    public Result<User> getDemo() throws Exception{
        User user = new User(1,"admin","password");
        demoService.getDemo();
        return ResultUtil.success(user);
    }

    @GetMapping("/httpDemo")
    public Result httpDemo() {
        return ResultUtil.success("");
    }

    @GetMapping("/test/{id}")
    public Result test(@PathVariable("id") int id) {
        //String str = HttpUtil.get("http://localhost:8081/httpDemo");
        User user = demoService.findUser(id);
        return ResultUtil.success(user);
    }
}
