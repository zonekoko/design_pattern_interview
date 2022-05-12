package com.zyp.design_pattern_interview.design_pattern.proxy.strategy;

import com.zyp.design_pattern_interview.design_pattern.proxy.TestEnums;
import com.zyp.design_pattern_interview.design_pattern.proxy.annotation.TestAnnotation;
import org.springframework.stereotype.Component;

/**
 * @ClassName StudentHandler
 * @Description TODO
 * @Author zhangyanping
 * @Date 2022/5/12 16:43
 * @Version 1.0
 */
@TestAnnotation(TestEnums.Student)
@Component
public class StudentHandler implements PersonFactory{
    @Override
    public void hello() {
        System.out.println("hello,代理过后的student");
    }
}
