package com.example.springframeworklearn.beanPostProcessorUsage;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:tianhaolin
 * @version:1.0
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext-beanPostProcessorUsage.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user.getName());
        Customer customer = applicationContext.getBean("customer", Customer.class);
        System.out.println(customer.getName());
    }
}
