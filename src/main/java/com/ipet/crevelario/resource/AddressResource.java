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

import com.ipet.crevelario.domain.Address;
import com.ipet.crevelario.services.AddressService;

import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;
@RestController
@RequestMapping(value="/address")
public class AddressResource {
	
	@Autowired
	private AddressService addressService;

	@GetMapping
	public ResponseEntity<Flux<Address>> getAll() {
		return ResponseEntity.ok(addressService.getAll());
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Mono<Address>> getById(@PathVariable String id) {
		return ResponseEntity.ok(addressService.getById(id));
	}

	@PutMapping(value= "/{id}")
	public ResponseEntity<Mono<Address>> update(@PathVariable String id, @RequestBody Address address) {
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(addressService.update(id, address));
	}

	@PostMapping
	public ResponseEntity<Mono<Address>> create(@RequestBody Address address) {
		return ResponseEntity.status(HttpStatus.CREATED).body(addressService.create(address));
	}
}
