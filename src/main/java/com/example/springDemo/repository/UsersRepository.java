package com.example.springDemo.repository;

import com.example.springDemo.entity.MyUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface UsersRepository extends CrudRepository<MyUser, Long> {

    Optional<MyUser> findByUserName (String userName);

    Iterable<MyUser> findAll();

}
