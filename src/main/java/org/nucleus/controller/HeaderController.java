package org.nucleus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.net.http.HttpRequest;
import java.util.Enumeration;

@Controller
public class HeaderController {

    @RequestMapping("/referer")
    public String getHeaderView(@RequestHeader("referer") String url, Model model){

        String result = null;

        if(url == null)
            result = "error";
        else {
            result = "CheckHeader";
            model.addAttribute("referer" ,url);
        }
        return result;
    }


/*
    @RequestMapping("/referer")
    public String getHeaderView1(HttpServletRequest request){

        Enumeration headerNames = request.getHeaderNames();

        while(headerNames.hasMoreElements()){
            System.out.println(headerNames.nextElement());
        }

        String result = null;


        return "HelloWorld";

    }
*/



}
