package com.exampel.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller -> will return anything
//RestController -> will return always response body
@RestController
public class login {

    //setting an endpoint

    //@RequestMapping(value="/",method= RequestMethod.GET)
    @GetMapping("/")
    public String Login() {
        return "welcome  to login";
    }
}
