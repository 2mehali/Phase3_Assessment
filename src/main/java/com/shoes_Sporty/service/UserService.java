package com.shoes_Sporty.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoes_Sporty.model.User;
import com.shoes_Sporty.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public User signUp(User user) {
		return userRepository.save(user);
	}
	
	public User saveUserWithProduct(User user) {
		return userRepository.save(user);
	}

	public List<User> allSignedUpUsers() {
		return userRepository.findAll();
	}

	public Optional<User> getSignedUpUserByName(String name) {
		Optional<User> user = userRepository.findUserByName(name);
		return user;
	}
	
	public Optional<User> getSignedUpUserById(int id) {
		Optional<User> user = userRepository.findById(id);
		return user;
	}
}
