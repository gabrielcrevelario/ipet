package com.ipet.crevelario.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ipet.crevelario.domain.User;
import com.ipet.crevelario.repositories.UserRepository;

import reactor.core.publisher.Mono;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public Mono<User> getById(String id) {
		return userRepository.findById(id);
	}

	public Mono<User> create(User user) {
		return userRepository.insert(user);
	}
	public Mono<User> update(String id,User user) {
		user.setId(id);
		return userRepository.save(user);
	}

	public void delete(String id) {
		userRepository.deleteById(id);
	}
}
