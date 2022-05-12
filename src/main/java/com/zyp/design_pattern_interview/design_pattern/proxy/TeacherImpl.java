package com.zyp.design_pattern_interview.design_pattern.proxy;

import com.zyp.design_pattern_interview.design_pattern.proxy.annotation.TestAnnotation;
import org.springframework.stereotype.Component;

/**
 * @ClassName PersonImpl
 * @Description TODO
 * @Author zhangyanping
 * @Date 2022/5/12 16:22
 * @Version 1.0
 */
@TestAnnotation(TestEnums.TEACHER)
@Component
public class TeacherImpl implements Teacher {
    @Override
    public void hello() {
        System.out.println("teacher,hello");
    }
}
