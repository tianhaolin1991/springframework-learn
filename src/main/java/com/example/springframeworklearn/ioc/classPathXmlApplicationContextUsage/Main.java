package com.example.springframeworklearn.ioc.classPathXmlApplicationContextUsage;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:tianhaolin
 * @version:1.0
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext-classPathXmlApplicationContextUsage.xml");
        User user = applicationContext.getBean("user", User.class);
        Name name = user.getName();
        System.out.println(name.getName());
    }
}
