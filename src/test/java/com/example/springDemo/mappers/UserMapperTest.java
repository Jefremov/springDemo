package com.example.springDemo.mappers;

import com.example.springDemo.dto.UserRegisterDto;
import com.example.springDemo.dto.UserUpdateDto;
import com.example.springDemo.entity.DemoUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


import static org.junit.jupiter.api.Assertions.*;

class UserMapperTest {

    @Test
    void userRegisterDtoToUser() {

        UserMapper mapper = new UserMapper();

        DemoUser user = new DemoUser();
        user.setUserName("Foobar");
        user.setUserDescription("used as metasyntactic variables and placeholder names in computer programming or computer-related documentation");

        UserRegisterDto registerDto = new UserRegisterDto();
        registerDto.setUserName("Foobar");
        registerDto.setUserDescription("used as metasyntactic variables and placeholder names in computer programming or computer-related documentation");

        DemoUser demoUser = mapper.userRegisterDtoToUser(registerDto);
        assertEquals(user, demoUser);
    }

    @Test
    void userUpdateDtoToUser() {

        UserMapper mapper = new UserMapper();

        DemoUser user = new DemoUser();
        user.setUserName("Foobar");
        user.setUserDescription("used as metasyntactic variables and placeholder names in computer programming or computer-related documentation");

        UserUpdateDto updateDto = new UserUpdateDto();
        updateDto.setUserName("Foobar");
        updateDto.setUserDescription("used as metasyntactic variables and placeholder names in computer programming or computer-related documentation");

        DemoUser demoUser = mapper.userUpdateDtoToUser(updateDto);
        assertEquals(user, demoUser);
    }
}