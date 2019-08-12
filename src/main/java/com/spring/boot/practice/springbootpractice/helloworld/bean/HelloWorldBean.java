package com.spring.boot.practice.helloworld.bean;

/**
 * Created by hemanthponnuru on 2019-07-29
 */
public class HelloWorldBean {

    private String text;

    public HelloWorldBean(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
