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

import com.ipet.crevelario.domain.Category;
import com.ipet.crevelario.services.CategoryService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	@Autowired
	private CategoryService categoryService;

	@GetMapping
	public ResponseEntity<Flux<Category>> getAll() {
		return ResponseEntity.ok(categoryService.getAll());
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Mono<Category>> getById(@PathVariable String id) {
		return ResponseEntity.ok(categoryService.getById(id));
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> remove(@PathVariable String id) {
		categoryService.remove(id);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);

	}

	@PostMapping
	public ResponseEntity<Mono<Category>> create(@RequestBody Category category) {
		return ResponseEntity.status(HttpStatus.CREATED).body(categoryService.create(category));
	}
}
