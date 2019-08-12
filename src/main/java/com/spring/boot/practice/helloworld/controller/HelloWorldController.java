package com.practice.restful.webservices.helloworld.controller;

import com.practice.restful.webservices.helloworld.bean.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hemanthponnuru on 2019-07-26
 */
@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello World......";
    }

    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World......");
    }

    /*@GetMapping("/hello-world-internationalize")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World......");
    }*/
}
