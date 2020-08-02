package springboot.simple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springboot.simple.entity.NgUpc;
import springboot.simple.service.NgUpcService;
import springboot.simple.vo.Person;

/**
 * @author mortal
 * @since 2020-07-25
 */
@Controller
public class TestController {

    @Autowired
    private NgUpcService ngUpcService;
    @Autowired
    Person person;

    @RequestMapping("/test.json")
    @ResponseBody
    public NgUpc getUpc() {
        System.err.println(person.toString());
        return ngUpcService.queryById(123L);
    }
}
