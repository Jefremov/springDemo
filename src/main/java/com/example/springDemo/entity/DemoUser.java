package com.example.springDemo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;


@Data
@Entity
public class DemoUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "userName")
    private String userName;
    @Column(name = "userDescription")
    private String userDescription;

    @Override
    public String toString() {
        return "DemoUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userDescription='" + userDescription + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DemoUser demoUser = (DemoUser) o;
        return userName.equals(demoUser.userName) && userDescription.equals(demoUser.userDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, userDescription);
    }
}
