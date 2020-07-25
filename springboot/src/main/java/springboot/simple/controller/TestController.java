package springboot.simple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springboot.simple.entity.NgUpc;
import springboot.simple.service.NgUpcService;

/**
 * @author mortal
 * @since 2020-07-25
 */
@Controller
public class TestController {

    @Autowired
    private NgUpcService ngUpcService;

    @RequestMapping("/test.json")
    @ResponseBody
    public NgUpc getUpc() {
        return ngUpcService.queryById(123L);
    }
}
