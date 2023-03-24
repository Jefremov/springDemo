package com.example.springDemo.entity;

import jakarta.persistence.*;
import lombok.Data;


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
}
