package com.example.springDemo.dto;

import lombok.Data;

import java.util.Objects;

@Data
public class UserRegisterDto {

    private String userName;
    private String userDescription;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRegisterDto that = (UserRegisterDto) o;
        return userName.equals(that.userName) && userDescription.equals(that.userDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, userDescription);
    }
}
