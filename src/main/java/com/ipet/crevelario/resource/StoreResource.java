package com.ipet.crevelario.resource;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipet.crevelario.domain.Store;
import com.ipet.crevelario.services.StoreService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/stores")
public class StoreResource {

	@Autowired
	private StoreService storeService;

	@GetMapping
	public ResponseEntity<Flux<Store>> getAll() {
		return ResponseEntity.status(HttpStatus.OK).body(storeService.getAll());
	}

	@GetMapping(value = "{id}")
	public ResponseEntity<Mono<Store>> getById(@PathVariable String id) {
		return ResponseEntity.status(HttpStatus.OK).body(storeService.getById(id));
	}

	@PostMapping
	public ResponseEntity<Mono<Store>> create(@RequestBody Store store) {
		Mono<Store> storeCreated = storeService.create(store);
		return ResponseEntity.status(HttpStatus.CREATED).body(storeCreated);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> remove(@PathVariable String id) {
		storeService.remove(id);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}

	@PutMapping(value = "{id}")
	public ResponseEntity<Mono<Store>> update(@PathVariable String id, @RequestBody Store store) {
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(storeService.update(id, store));
	}
}
