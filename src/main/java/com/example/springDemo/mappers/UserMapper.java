package com.example.springDemo.mappers;

import com.example.springDemo.dto.UserRegisterDto;
import com.example.springDemo.entity.User;
import com.example.springDemo.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    private UsersRepository usersRepository;

    @Autowired
    public UserMapper(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }


    public User userRegisterDtoToUser(UserRegisterDto userDto){

        User user = new User();
        user.setUserName(userDto.getUserName());
        user.setUserDescription(user.getUserDescription());
        return user;
    }
}
