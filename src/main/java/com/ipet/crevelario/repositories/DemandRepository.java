package com.ipet.crevelario.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.ipet.crevelario.domain.Demand;

public interface DemandRepository  extends ReactiveMongoRepository<Demand, String>  {

}
