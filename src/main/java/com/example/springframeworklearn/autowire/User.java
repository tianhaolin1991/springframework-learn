package com.example.springframeworklearn.autowire;

import com.example.springframeworklearn.HelloWorld;

/**未使用@Autowire,而且xml中也没有写<property></property>
 * @author:tianhaolin
 * @version:1.0
 */
public class User {

    private HelloWorld helloWorld;
    private Name name;

    private static String value;

    public HelloWorld getHelloWorld() {
        return helloWorld;
    }

    public void setHelloWorld(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
        helloWorld.say();
    }

    public static String getValue() {
        return value;
    }

    public static void setValue(String value) {
        User.value = value;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Name getName(){
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "helloWorld=" + helloWorld +
                '}';
    }
}
