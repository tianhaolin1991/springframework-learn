package com.example.springframeworklearn.ioc;

import org.springframework.stereotype.Component;

public class HelloWorld {

    private String str;

    public void setStr(String str) {
        this.str = str;
    }

    public void say(){
        System.out.println(str);
    }


}
