package com.zyp.design_pattern_interview.design_pattern.proxy.strategy;

import com.zyp.design_pattern_interview.design_pattern.proxy.TestEnums;
import com.zyp.design_pattern_interview.design_pattern.proxy.annotation.TestAnnotation;
import org.springframework.stereotype.Component;

/**
 * @ClassName TeacherHandler
 * @Description TODO
 * @Author zhangyanping
 * @Date 2022/5/12 16:41
 * @Version 1.0
 */
@TestAnnotation(TestEnums.TEACHER)
@Component
public class TeacherHandler implements PersonFactory{
    @Override
    public void hello() {
        System.out.println("hello,代理过后的teacher");
    }
}
