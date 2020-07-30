package com.personal.springboot.start.entity;

/**
 * @author mortal
 * @since 2020-07-28
 */
public class User {

    private Long id;

    private String name;

    private Integer age;

    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
