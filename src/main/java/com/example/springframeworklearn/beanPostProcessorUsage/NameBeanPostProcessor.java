package com.example.springframeworklearn.beanPostProcessorUsage;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

/**BeanPostProcessor的应用,将Name属性注入到bean中
 * @author:tianhaolin
 * @version:1.0
 */
@Component
public class NameBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof NameInit){
            Name name = new Name();
            name.setName(beanName);
            try {
                Field field = bean.getClass().getDeclaredField("name");
                field.setAccessible(true);
                field.set(bean,name);
                System.out.println("BeanPostProcessor前置了"+beanName+"的name属性!");
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor后置了"+beanName);
        return bean;
    }
}
