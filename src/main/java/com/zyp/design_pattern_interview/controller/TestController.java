package com.zyp.design_pattern_interview.controller;

import com.zyp.design_pattern_interview.design_pattern.proxy.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author zhangyanping
 * @Date 2022/5/12 17:52
 * @Version 1.0
 */
@RestController
@Slf4j
@RequestMapping("/test")
public class TestController {

    @Autowired
    private MyInvocationHandler myInvocationHandler;

    @GetMapping("/testDesign_pattern")
    public void testDesign_pattern(){

        Student student = (Student) myInvocationHandler.getJdkProxy(new StudentImpl());
        student.hello();

    }


}
