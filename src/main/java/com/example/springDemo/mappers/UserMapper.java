package com.example.springDemo.mappers;

import com.example.springDemo.dto.UserRegisterDto;
import com.example.springDemo.entity.DemoUser;
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


    public DemoUser userRegisterDtoToUser(UserRegisterDto userDto){

        DemoUser demoUser = new DemoUser();
        demoUser.setUserName(userDto.getUserName());
        demoUser.setUserDescription(userDto.getUserDescription());
        return demoUser;
    }
}
