package com.example.springDemo.repository;

import com.example.springDemo.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UsersRepository extends CrudRepository {

    Optional<User> findByUserName (String userName);

}
