package com.example.springDemo.controllers;


import com.example.springDemo.dto.UserRegisterDto;
import com.example.springDemo.entity.MyUser;
import com.example.springDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    UserService userService;

    @PostMapping("add")
    public String addUser(@RequestBody UserRegisterDto userRegisterDto){
        return userService.createUser(userRegisterDto);
    }

    @GetMapping("showall")
    public Iterable<MyUser> showAllUsers(){
        return userService.showAllUsers();
    }

    @GetMapping("hello")
    public String hello(){
        return "hello world";
    }
}
