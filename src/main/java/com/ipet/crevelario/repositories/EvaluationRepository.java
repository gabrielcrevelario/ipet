package com.ipet.crevelario.repositories;
import java.util.List;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.ipet.crevelario.domain.Evaluation;

public interface EvaluationRepository  extends ReactiveMongoRepository<Evaluation, String>  {

	@Query("{'store.id':  ?0}")
	List<Evaluation> findAllEvaluationByStoreId(String storeId);
}
