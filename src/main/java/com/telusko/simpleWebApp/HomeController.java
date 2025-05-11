package com.telusko.simpleWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
    @RequestMapping("/")
    @ResponseBody
    public String greet(){
        return "Welcome Aashi Gupta in the world of papa's webapp development";
    }
}
