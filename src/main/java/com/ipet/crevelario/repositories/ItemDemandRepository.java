package com.ipet.crevelario.repositories;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.ipet.crevelario.domain.ItemDemand;

public interface ItemDemandRepository  extends ReactiveMongoRepository<ItemDemand, String>  {

}
