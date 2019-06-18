package com.example.springframeworklearn.aop.proxyFactoryBean;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:tianhaolin
 * @version:1.0
 */
public class Main implements ApplicationContextAware {
    private ApplicationContext ac;

    public static void main(String[] args) {

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext-aop-proxyFactoryBean.xml");
        TestInterface target = ac.getBean("targetProxy",TestInterface.class);
        TestInterface target2 = ac.getBean("targetProxy",TestInterface.class);

        target.findMethod();
        target.testMethod();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ac = applicationContext;
    }
}
