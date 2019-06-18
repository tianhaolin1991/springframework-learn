package com.example.springframeworklearn.ioc.beanPostProcessorUsage;

import org.springframework.stereotype.Component;

/**Name
 * @author:tianhaolin
 * @version:1.0
 */
@Component
public class Name {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name{" +
                "name='" + name + '\'' +
                '}';
    }
}
