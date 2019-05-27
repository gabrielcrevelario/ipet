package com.ipet.crevelario.repositories;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.ipet.crevelario.domain.Client;

public interface ClientRepository  extends ReactiveMongoRepository<Client, String>  {

}
