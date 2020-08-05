package com.spring.boot.journal.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mortal
 * @since 2020-08-04
 */
@RestController
public class LogController {
    private static final Logger logger = LoggerFactory.getLogger(LogController.class);

    @RequestMapping("log")
    public String sayHello() {
        logger.info("this  is logging test,{}","Spring boot");
        return "is done";
    }

}
