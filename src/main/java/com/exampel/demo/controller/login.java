package com.exampel.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//component ->indicates that the class is a  custom beans and detect is automatically.
//Controller -> indicates that it is a controller
//RestController -> indicates that it is a controller + will always return a response body
@RestController
public class login {

    //setting endpointa

    //@RequestMapping(value="/",method= RequestMethod.GET)
    @GetMapping("/")
    public String Login() {
        return "welcome  to login";
    }
}
