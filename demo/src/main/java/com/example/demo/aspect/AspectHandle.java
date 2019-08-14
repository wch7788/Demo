package com.example.demo.aspect;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

@Aspect
@Component
public class AspectHandle {

    private final static Logger log = LoggerFactory.getLogger(AspectHandle.class);

    @Pointcut ("execution (public * com.example.demo.controller.DemoController.*(..))")
    public void log() {
    }

    @Before("log()")
    public void beforeLog() {
        log.info("Before Log...");
    }
}
