package com.ipet.crevelario.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.ipet.crevelario.domain.Store;

public interface StoreRepository  extends ReactiveMongoRepository<Store, String>  {

}
