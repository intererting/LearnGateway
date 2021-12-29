package com.example.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yiliyang
 * @version 1.0
 * @date 2021/12/28 下午4:10
 * @since 1.0
 */
@RestController
public class TestController {

    @GetMapping("test")
    public String test(@RequestParam("name") String name) {
        return "test from 8081 " + name;
    }

}
