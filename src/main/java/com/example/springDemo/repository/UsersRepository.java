package com.example.springDemo.repository;

import com.example.springDemo.entity.DemoUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface UsersRepository extends CrudRepository<DemoUser, Long> {

    Optional<DemoUser> findByUserName (String userName);

    Iterable<DemoUser> findAll();

    boolean existsByUserName(String userName);

    DemoUser getDemoUserByUserName(String userName);

}
