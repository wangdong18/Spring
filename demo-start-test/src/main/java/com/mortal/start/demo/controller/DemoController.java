package com.mortal.start.demo.controller;

import com.mortal.starter.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mortal
 * @since 2020-09-11
 */
@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;

    @GetMapping("hello.json")
    public String hello() {
        return demoService.hello();
    }

}
