package com.example.crabbywebpage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    @RequestMapping("/index") //when user requests this page

    public String homePage(){
        return "index";
    }

}
