package com.example.springframeworklearn.ioc.classPathXmlApplicationContextUsage;

import org.springframework.beans.factory.FactoryBean;

/**使用UserFactoryBean创建User对象
 * @author:tianhaolin
 * @version:1.0
 */
public class UserFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        User user = new User();
        user.setName(new Name());
        System.out.println("使用UserFactoryBean创建了User对象");
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
