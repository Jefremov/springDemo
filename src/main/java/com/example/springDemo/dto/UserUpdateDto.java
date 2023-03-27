package com.example.springDemo.dto;

import lombok.Data;

import java.util.Objects;

@Data
public class UserUpdateDto {

    private String userName;
    private String userDescription;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserUpdateDto that = (UserUpdateDto) o;
        return Objects.equals(userName, that.userName) && Objects.equals(userDescription, that.userDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, userDescription);
    }
}
