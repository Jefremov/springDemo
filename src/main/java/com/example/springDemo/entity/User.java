package com.example.springDemo.entity;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userName;
    private String userDescription;


}
