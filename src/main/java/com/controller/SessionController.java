package com.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.UserEntity;

//kotlin 
//android + java 
//sat:2 4-> sun:3 android -> 
@RestController
public class SessionController {

	@PostMapping("/signup")
	public UserEntity signup(@RequestBody UserEntity userEntity) {
		System.out.println(userEntity.getFirstName());
		System.out.println(userEntity.getEmail());
		return userEntity;//no 
	}
}
//rest client -> postman 
