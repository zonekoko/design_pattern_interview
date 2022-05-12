package com.zyp.design_pattern_interview.design_pattern.proxy;

import com.zyp.design_pattern_interview.design_pattern.proxy.annotation.TestAnnotation;
import org.springframework.stereotype.Component;

/**
 * @ClassName StudentImpl
 * @Description TODO
 * @Author zhangyanping
 * @Date 2022/5/12 16:33
 * @Version 1.0
 */
@TestAnnotation(TestEnums.Student)
@Component
public class StudentImpl implements Student{
    @Override
    public void hello() {
        System.out.println("Student,hello");
    }
}
