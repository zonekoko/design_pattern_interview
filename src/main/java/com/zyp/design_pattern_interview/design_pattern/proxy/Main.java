package com.zyp.design_pattern_interview.design_pattern.proxy;

/**
 * @ClassName Main
 * @Description TODO
 * @Author zhangyanping
 * @Date 2022/5/12 15:50
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
        MyInvocationHandler handler = new MyInvocationHandler();
        Teacher teacher = (Teacher)handler.getJdkProxy(new TeacherImpl());
        teacher.hello();
    }
}
