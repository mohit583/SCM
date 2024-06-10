package com.scm.scm20.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String homepage(Model model)
    {
       model.addAttribute("name","mohitgehlot");
       model.addAttribute("company","infosys");
       model.addAttribute("link","https://www.geeksforgeeks.org/spring-boot-interview-questions/");
        return "home";
    }

    @RequestMapping("/about")
    public String about(Model model)
    {
        model.addAttribute("isLogin",true);
        System.out.println("About page loading");
        return "about" ;
    }

    @RequestMapping("/service")
    public String service()
    {
        System.out.println("Service page loading ");
        return "service" ;
    }
}
