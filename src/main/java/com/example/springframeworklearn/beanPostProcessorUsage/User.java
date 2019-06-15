package com.example.springframeworklearn.beanPostProcessorUsage;

/**User实现了NameInit接口
 * @author:tianhaolin
 * @version:1.0
 */
public class User implements NameInit {

    private Name name;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
