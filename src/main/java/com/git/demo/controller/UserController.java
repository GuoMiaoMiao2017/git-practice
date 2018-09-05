package com.git.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/")
public class UserController {
    @PostMapping(value = "/login")
    public Map<String, Object> login(@RequestBody String name) {
        //验证用户登录
        return null;
    }
}
