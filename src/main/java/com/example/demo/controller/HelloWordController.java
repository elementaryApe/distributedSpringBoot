package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desc: helloWord
 * User: hansh
 * Date: 2017/12/5
 * Time: 17:23
 */
@RestController
@RequestMapping("/hello")
public class HelloWordController {

    @RequestMapping("/one")
    public String index(){
        String json="helloWord";
        return  json ;
    }
}
