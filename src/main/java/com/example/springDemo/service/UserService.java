package com.example.springDemo.service;

import com.example.springDemo.dto.UserRegisterDto;
import com.example.springDemo.entity.User;
import com.example.springDemo.mappers.UserMapper;
import com.example.springDemo.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    private UsersRepository usersRepository;
    private UserMapper userMapper;

    @Autowired
    public UserService(UsersRepository usersRepository, UserMapper userMapper) {
        this.usersRepository = usersRepository;
        this.userMapper = userMapper;
    }

    public String createUser(UserRegisterDto userDto) {

        User user = userMapper.userRegisterDtoToUser(userDto);
        return "User" + userDto.getUserName() + " created";

    }
}
