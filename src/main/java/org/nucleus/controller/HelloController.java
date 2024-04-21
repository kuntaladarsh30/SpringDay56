package org.nucleus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    // mapping /hello url with get type of request
    //@RequestMapping(value = "/hello", method = RequestMethod.GET)
    // an alternative to above one but more preferable
    @RequestMapping(value = "/hello")
    public String getHelloView(){
        return "HelloWorld";
    }


}
