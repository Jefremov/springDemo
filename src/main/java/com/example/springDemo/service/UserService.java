package com.example.springDemo.service;

import com.example.springDemo.dto.UserRegisterDto;
import com.example.springDemo.entity.MyUser;
import com.example.springDemo.mappers.UserMapper;
import com.example.springDemo.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {


    private UsersRepository usersRepository;
    private UserMapper userMapper;

    @Autowired
    public UserService(UsersRepository usersRepository, UserMapper userMapper) {
        this.usersRepository = usersRepository;
        this.userMapper = userMapper;
    }

    public String createUser(UserRegisterDto userDto) {

        MyUser myUser = userMapper.userRegisterDtoToUser(userDto);
        usersRepository.save(myUser);
        return "User" + myUser.getUserName() + " created";

    }

    public Iterable<MyUser> showAllUsers(){
        return usersRepository.findAll();
    }

}
