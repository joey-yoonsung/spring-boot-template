package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        log.info("The hello method is called !!");
        return "hello world";
    }
}
