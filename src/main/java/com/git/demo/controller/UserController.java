package com.git.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {
    public void cc() {
        System.out.println("aaaaa");
        System.out.println("bbbbb");
        System.out.println("ccccc");
        System.out.println("ggggg");
    }
}
