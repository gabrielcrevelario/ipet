package com.ipet.crevelario.repositories;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.ipet.crevelario.domain.Address;

public interface AddressRepository  extends ReactiveMongoRepository<Address, String>  {

}
