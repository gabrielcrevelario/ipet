package com.ipet.crevelario.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.ipet.crevelario.domain.Category;

public interface CategoryRepository  extends ReactiveMongoRepository<Category, String>  {

}
