package com.ipet.crevelario.services;


import org.springframework.stereotype.Service;
import com.ipet.crevelario.domain.Category;
import com.ipet.crevelario.repositories.CategoryRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CategoryService {

	
	private final CategoryRepository categoryRepository;
    public CategoryService(CategoryRepository categoryRepository) {
    	this.categoryRepository = categoryRepository;
    }
	
	public Flux<Category> getAll() {
		return categoryRepository.findAll();
	}

	public Mono<Category> getById(String id) {
		return categoryRepository.findById(id);
	}

	public Mono<Category> create(Category category) {
		return categoryRepository.insert(category);
	}

	public void remove(String id) {
		categoryRepository.deleteById(id);
	}
}
