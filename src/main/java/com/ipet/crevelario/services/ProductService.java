package com.ipet.crevelario.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipet.crevelario.domain.Product;
import com.ipet.crevelario.repositories.ProductRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Flux<Product> getAll() {
		return productRepository.findAll();
	}
	public Mono<Product> getById(String id) {
		return productRepository.findById(id);
	}
	public Mono<Product> create(Product product) {
		return productRepository.insert(product);
	}
	public void remove(String id) {
		productRepository.deleteById(id);
	}
}
