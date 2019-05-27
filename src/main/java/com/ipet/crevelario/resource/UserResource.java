package com.ipet.crevelario.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ipet.crevelario.domain.User;
import com.ipet.crevelario.services.UserService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	@Autowired
	private UserService userService;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Mono<User>> getById(@PathVariable String id) {
		return ResponseEntity.ok(userService.getById(id));
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<Mono<User>> update(@PathVariable String id, @RequestBody User user) {
		return ResponseEntity.ok(userService.update(id, user));
	}

	@PostMapping
	public ResponseEntity<Mono<User>> create(@RequestBody User user) {
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.create(user));
	}
}
