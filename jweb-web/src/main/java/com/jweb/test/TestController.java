package com.jweb.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("${admin.url.prefix}")
public class TestController {

    @RequestMapping(method = RequestMethod.GET)
    public String test(){
        return "index";
    }
}
