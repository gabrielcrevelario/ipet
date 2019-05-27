package com.ipet.crevelario.repositories;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.ipet.crevelario.domain.SubCategory;

public interface SubCategoryRepository  extends ReactiveMongoRepository<SubCategory, String>  {

}
