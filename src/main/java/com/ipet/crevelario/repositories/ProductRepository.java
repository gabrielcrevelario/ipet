package com.ipet.crevelario.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.ipet.crevelario.domain.Product;

public interface ProductRepository  extends ReactiveMongoRepository<Product, String>  {

}
