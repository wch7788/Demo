package com.example.demo.exception;

import com.example.demo.ResultUtil;
import com.example.demo.bean.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class HandleException {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handleException(Exception e ) {

        if (e instanceof UserException) {
            UserException exception = (UserException)e;
            return ResultUtil.fillResult(exception.getCode(),exception.getMessage(),"");
        }else {
            return ResultUtil.error(e);
        }
    }
}
