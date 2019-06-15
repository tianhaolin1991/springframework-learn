package com.example.springframeworklearn.applicationContextAwareUsage;

import org.springframework.stereotype.Component;

/**
 * @author:tianhaolin
 * @version:1.0
 */
@Component
public class Name {
    private String name = "张三";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
