package com.zyp.design_pattern_interview.design_pattern.proxy;

import lombok.Getter;

/**
 * @ClassName TestEnums
 * @Description TODO
 * @Author zhangyanping
 * @Date 2022/5/12 16:35
 * @Version 1.0
 */
public enum TestEnums {

    TEACHER("teacher"),
    Student("student"),
    ;

    @Getter
    private String role;

    TestEnums(String role) {
        this.role = role;
    }


}
