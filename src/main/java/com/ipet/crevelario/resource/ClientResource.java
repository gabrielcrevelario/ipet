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
import com.ipet.crevelario.domain.Client;
import com.ipet.crevelario.services.ClientService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value="/clients")
public class ClientResource {
	@Autowired
	private ClientService clientService;

	@GetMapping
	public ResponseEntity<Flux<Client>> getAll() {
		return ResponseEntity.ok(clientService.getAll());
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Mono<Client>> getById(@PathVariable String id) {
		return ResponseEntity.ok(clientService.getById(id));
	}	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Mono<Client>> update(@PathVariable String id, @RequestBody
			Client client) {
		return ResponseEntity.ok(clientService.update(id,client));
	}	

	@PostMapping
	public ResponseEntity<Mono<Client>> create(@RequestBody Client client) {
		return ResponseEntity.status(HttpStatus.CREATED).body(clientService.create(client));
	}
}
