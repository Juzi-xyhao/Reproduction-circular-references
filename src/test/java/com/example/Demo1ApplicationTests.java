package com.example;

import com.example.Service.TestService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class Demo1ApplicationTests {
@Resource
    TestService testServiceInTest;
    @Test
    void contextLoads() {
        testServiceInTest.test();
    }
}
