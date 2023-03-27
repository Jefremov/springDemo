package com.example.springDemo.mappers;

import com.example.springDemo.dto.UserRegisterDto;
import com.example.springDemo.dto.UserUpdateDto;
import com.example.springDemo.entity.DemoUser;
import com.example.springDemo.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public DemoUser userRegisterDtoToUser(UserRegisterDto userDto){

        DemoUser demoUser = new DemoUser();
        demoUser.setUserName(userDto.getUserName());
        demoUser.setUserDescription(userDto.getUserDescription());
        return demoUser;
    }

    public DemoUser userUpdateDtoToUser(UserUpdateDto userUpdateDto){

        DemoUser demoUser = new DemoUser();
        demoUser.setUserName(userUpdateDto.getUserName());
        demoUser.setUserDescription(userUpdateDto.getUserDescription());
        return demoUser;
    }


}
