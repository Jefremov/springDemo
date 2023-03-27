package com.example.springDemo.service;

import com.example.springDemo.dto.UserRegisterDto;
import com.example.springDemo.dto.UserUpdateDto;
import com.example.springDemo.entity.DemoUser;
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

        DemoUser demoUser = userMapper.userRegisterDtoToUser(userDto);
        if (!usersRepository.existsByUserName(demoUser.getUserName())) {
            usersRepository.save(demoUser);
            return "User " + demoUser.getUserName() + " created";
        } else
            return "User " + demoUser.getUserName() + " is exist. Try another name";
    }

    public Iterable<DemoUser> showAllUsers() {
        return usersRepository.findAll();
    }

    public String showUserByUserName(String userName) {
        if (usersRepository.existsByUserName(userName))
            return usersRepository.findByUserName(userName).toString();
        else return "Error: user " + userName + " not exist";
    }

    public String updateUser(UserUpdateDto userUpdateDto) {
        DemoUser demoUser = userMapper.userUpdateDtoToUser(userUpdateDto);
        if (usersRepository.existsByUserName(demoUser.getUserName())) {
            DemoUser demoUserRepo = usersRepository.getDemoUserByUserName(userUpdateDto.getUserName());
            demoUserRepo.setUserDescription(userUpdateDto.getUserDescription());
            usersRepository.save(demoUserRepo);
            return "User " + userUpdateDto.getUserName() + " updated";
        } else
            return "User " + userUpdateDto.getUserName() + " is not exist";
    }

}
