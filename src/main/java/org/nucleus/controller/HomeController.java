package org.nucleus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    // mapping /hello url with get type of request
    //@RequestMapping(value = "/hello", method = RequestMethod.GET)
    @RequestMapping(value = "/hello")
    public String getHelloView(){
        return "HelloWorld";
    }

    @RequestMapping("/helloUser")
    public String getHelloUserView(@RequestParam("username") String user, Model model){

        model.addAttribute("username" , user);

        return "display";
    }
    @RequestMapping("/helloUserModelAndView")
    public ModelAndView getHelloUserViewMV(@RequestParam("username") String user, ModelAndView model){

        model.addObject("username",user);
        model.setViewName("display");

        return model;
    }



}
