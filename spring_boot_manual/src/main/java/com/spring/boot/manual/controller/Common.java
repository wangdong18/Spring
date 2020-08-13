package com.spring.boot.manual.controller;

import com.spring.boot.manual.pojo.User;
import com.spring.boot.manual.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mortal
 * @since 2020-08-13
 */
@RestController
public class Common {

    @Autowired
    private UserService userService;

    @RequestMapping("hello.json")
    public String hello() {
        return "hello";
    }


    @RequestMapping("select.json")
    public User select() {
        return userService.getUser();
    }


    @RequestMapping("update.json")
    public User update() {
        return userService.UpdateUser();
    }

    @RequestMapping("update2.json")
    public String update2() {
        userService.updateUserInnerUser();
        return "aass";

    }

}
