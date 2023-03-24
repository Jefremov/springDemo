package com.example.springDemo.mappers;

import com.example.springDemo.dto.UserRegisterDto;
import com.example.springDemo.entity.MyUser;
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


    public MyUser userRegisterDtoToUser(UserRegisterDto userDto){

        MyUser myUser = new MyUser();
        myUser.setUserName(userDto.getUserName());
        myUser.setUserDescription(userDto.getUserDescription());
        return myUser;
    }
}
