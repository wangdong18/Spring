package com.personal.springboot.start.controller;

import com.personal.springboot.start.entity.User;
import com.personal.springboot.start.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mortal
 * @since 2020-07-28
 */
@RestController
public class HelloWorldController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("test.json")
    public String hello() {
        return "hello world";
    }


    //method不写的话 get post都支持
    @RequestMapping("find/user.json")
    public User findUser(@RequestParam Long id) {
        return userService.findById(id);
    }
}
