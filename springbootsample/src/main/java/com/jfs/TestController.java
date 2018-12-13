package com.jfs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestController {

    public TestController() {
//        this.rep = rep;
        
    }
    
    @RequestMapping("/test")
//    @CrossOrigin(origins = "http://localhost:4200")
    public String test() {
        //return "redirect:/static/login.html";
        return "login";
    }
}