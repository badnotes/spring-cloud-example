package com.example.demo.web;

import com.example.demo.service.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jun.wan on 2018/2/22.
 *
 */
@RestController
public class HelloController {

    @Autowired
    private HelloRemote helloRemote;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {

        return helloRemote.hello(name);
    }
}