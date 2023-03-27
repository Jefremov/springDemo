package com.example.springDemo.controllers;


import com.example.springDemo.dto.UserRegisterDto;
import com.example.springDemo.dto.UserUpdateDto;
import com.example.springDemo.entity.DemoUser;
import com.example.springDemo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
//@RequestMapping("/demo")
public class DemoController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody UserRegisterDto userRegisterDto){

        return userService.createUser(userRegisterDto);
    }

    @GetMapping("/showall")
    public Iterable<DemoUser> showAllUsers(){
        return userService.showAllUsers();
    }

    @GetMapping("/show/{userName}")
    public String showByUserName(@PathVariable("userName") String userName){
        return userService.showUserByUserName(userName);
    }

    @PutMapping("/update")
    public String updateDescription(@RequestBody UserUpdateDto userUpdateDto){
        return userService.updateUser(userUpdateDto);
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
