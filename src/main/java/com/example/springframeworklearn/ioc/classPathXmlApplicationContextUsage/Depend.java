package com.example.springframeworklearn.ioc.classPathXmlApplicationContextUsage;

import com.example.springframeworklearn.ioc.classPathXmlApplicationContextUsage.User;

/**
 * @author:tianhaolin
 * @version:1.0
 */
public class Depend {

    public Depend() {
        User.setValue("Use Depend to set Value");
    }

}
