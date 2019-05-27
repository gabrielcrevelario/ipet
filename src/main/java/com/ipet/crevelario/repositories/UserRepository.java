package com.ipet.crevelario.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.ipet.crevelario.domain.User;

public interface UserRepository extends ReactiveMongoRepository<User, String>  {

}
