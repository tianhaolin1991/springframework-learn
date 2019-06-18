package com.example.springframeworklearn.aop.proxyFactoryBean;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**通知类
 * @author:tianhaolin
 * @version:1.0
 */
public class AopTestAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(" before ...");
    }
}
