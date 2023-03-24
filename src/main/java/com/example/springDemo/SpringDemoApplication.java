package com.example.springDemo;

import com.example.springDemo.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoApplication {

	private UsersRepository usersRepository;

	@Autowired
	public SpringDemoApplication(UsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}

}
