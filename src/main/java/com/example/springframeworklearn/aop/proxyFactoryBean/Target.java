package com.example.springframeworklearn.aop.proxyFactoryBean;

/**被增强目标
 * @author:tianhaolin
 * @version:1.0
 */
public class Target implements TestInterface {

    @Override
    public void findMethod() {
        System.out.println(">>> findMethod");
    }

    @Override
    public void testMethod() {
        System.out.println(">>> saveMethod");
    }
}
