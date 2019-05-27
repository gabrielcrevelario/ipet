package com.ipet.crevelario.resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipet.crevelario.domain.Product;
import com.ipet.crevelario.services.ProductService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

	@Autowired
	private ProductService productService;

	@GetMapping
	public ResponseEntity<Flux<Product>> getAll() {
		return ResponseEntity.ok(productService.getAll());
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Mono<Product>> getById(@PathVariable String id) {
		return ResponseEntity.ok(productService.getById(id));
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> remove(@PathVariable String id) {
		productService.remove(id);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}

	@PostMapping
	public ResponseEntity<Mono<Product>> create(@RequestBody Product product) {
		return ResponseEntity.status(HttpStatus.CREATED).body(productService.create(product));
	}
}
