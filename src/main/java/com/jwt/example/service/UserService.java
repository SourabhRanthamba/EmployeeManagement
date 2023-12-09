package com.jwt.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.example.model.User;

@Service
public class UserService {

	private List<User> store=new ArrayList<>();
	
	public UserService() {
		store.add(new User(UUID.randomUUID().toString(),"Durgesh","durgesh@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Rahul","Rahul@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Shubham","Shubham@gmail.com"));

	}
	
	public List<User> getUser(){
		return this.store;
	}
}
