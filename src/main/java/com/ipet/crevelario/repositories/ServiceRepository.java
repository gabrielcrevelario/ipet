package com.ipet.crevelario.repositories;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.ipet.crevelario.domain.SystemService;

public interface ServiceRepository  extends ReactiveMongoRepository<SystemService, String>  {

}
