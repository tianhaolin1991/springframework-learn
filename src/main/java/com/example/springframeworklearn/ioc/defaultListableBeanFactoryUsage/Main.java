package com.example.springframeworklearn.ioc.defaultListableBeanFactoryUsage;

import com.example.springframeworklearn.ioc.HelloWorld;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[] args) {
        //创建Resource对象,Spring中所有资源都要先封装为Resource对象
        Resource resource = new ClassPathResource("applicationContext.xml");
        //创建beanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        //注意:这里beanFactory是以BeanDefinitionRegistry实现类的身份作为入参
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        //最终使用DefaultListableBeanFactory的registerBeanDefinition()将所有的bean注册到beanDefinition的Map中
        xmlBeanDefinitionReader.loadBeanDefinitions(resource);
        HelloWorld helloWorld = beanFactory.getBean("helloWorld",HelloWorld.class);
        helloWorld.say();
    }
}
