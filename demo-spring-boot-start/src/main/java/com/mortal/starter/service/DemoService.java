package com.mortal.starter.service;

import com.mortal.starter.properties.DemoProperties;

/**
 * @author mortal
 * @since 2020-09-11
 */

public class DemoService {

    private String name;
    private Integer age;

    public DemoService(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String sayName() {
        return "hello" + name;
    }

    public String hello() {
        return String.format("[name=%s, age=%d]", this.name, this.age);
    }
}
