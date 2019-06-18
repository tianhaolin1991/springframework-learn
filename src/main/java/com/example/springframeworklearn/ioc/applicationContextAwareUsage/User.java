package com.example.springframeworklearn.ioc.applicationContextAwareUsage;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**User没有使用@Autowire注入,xml中也没有使用autowire和<property></property>
 * @author:tianhaolin
 * @version:1.0
 */
@Component
public class User implements ApplicationContextAware {

    private ApplicationContext ac;
    private Name name;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ac = applicationContext;
        name = applicationContext.getBean("name",Name.class);
    }

    public Name getName() {
        return name;
    }
}
