package com.zyp.design_pattern_interview.design_pattern.proxy;

import com.zyp.design_pattern_interview.design_pattern.proxy.annotation.TestAnnotation;
import com.zyp.design_pattern_interview.design_pattern.proxy.config.PersonContainer;
import com.zyp.design_pattern_interview.design_pattern.proxy.strategy.PersonFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName MyInvocationHandler
 * @Description TODO
 * @Author zhangyanping
 * @Date 2022/5/12 15:51
 * @Version 1.0
 */
@Component
public class MyInvocationHandler implements InvocationHandler {

    @Autowired
    private PersonContainer<PersonFactory> personFactoryPersonContainer;

    Object target;

    /**
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        TestAnnotation annotation = target.getClass().getAnnotation(TestAnnotation.class);
        String role = annotation.value().getRole();
        PersonFactory adapterService = personFactoryPersonContainer.getAdapterService(role, PersonFactory.class);
        adapterService.hello();
        method.invoke(target, args);
        return proxy;
    }

    public Object getJdkProxy(Object targetProxy) {
        this.target = targetProxy;
        System.out.println(this.target.getClass());
        return Proxy.newProxyInstance(
                targetProxy.getClass().getClassLoader(),
                targetProxy.getClass().getInterfaces(),
                this
        );

    }


}
