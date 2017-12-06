package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Desc: helloWord
 * User: hansh
 * Date: 2017/12/5
 * Time: 17:23
 */
@RestController
public class HelloWordController {

    @RequestMapping("/hello")
    public Response index() {
        String json = "helloWord";
        return Response.status(Response.Status.OK).entity(json).type(MediaType.APPLICATION_JSON).build();
    }
}
