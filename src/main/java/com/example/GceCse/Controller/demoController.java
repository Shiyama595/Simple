package com.example.GceCse.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;


@Controller
public class demoController {
         @RequestMapping("/")
         public String home() {
        	 return "templates/Index";
         }         
}
