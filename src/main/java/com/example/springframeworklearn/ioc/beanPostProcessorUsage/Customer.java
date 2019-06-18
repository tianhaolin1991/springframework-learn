package com.example.springframeworklearn.ioc.beanPostProcessorUsage;

/**Customer没有实现NameInit接口
 * @author:tianhaolin
 * @version:1.0
 */
public class Customer {

    private Name name;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
