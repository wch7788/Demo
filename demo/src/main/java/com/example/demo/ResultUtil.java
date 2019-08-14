package com.example.demo;

import com.example.demo.bean.Result;

public class ResultUtil {

    public static Result success(Object data) {

        return fillResult(1,"成功",data);
    }

    public static Result fail(String message) {

        return fillResult(0,message,"");
    }

    public static Result error(Exception e) {
        return fillResult(-1,e.getMessage(),"");
    }

    public static Result fillResult(Integer code, String message, Object data) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        result.setData(data);
        return result;
    }
}
