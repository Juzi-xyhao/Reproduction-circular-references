package com.example.Service;

import jakarta.annotation.Resource;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestService {

    @Resource
//    @Lazy
    private TestService testService;


    @Transactional(rollbackFor = Exception.class)
    public void test(){
        System.out.println("主线程 = " + Thread.currentThread().getName());
        testService.asyncTest();
    }

    @Async
    public void asyncTest(){
        System.out.println("异步线程 = " + Thread.currentThread().getName());
    }
}
