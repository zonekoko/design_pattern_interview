package com.zyp.design_pattern_interview.design_pattern.proxy.annotation;

import com.zyp.design_pattern_interview.design_pattern.proxy.TestEnums;

import java.lang.annotation.*;

/**
 * @ClassName TestAnnotation
 * @Description TODO
 * @Author zhangyanping
 * @Date 2022/5/12 16:34
 * @Version 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@Target(ElementType.TYPE)
public @interface TestAnnotation {

    TestEnums value();
}
