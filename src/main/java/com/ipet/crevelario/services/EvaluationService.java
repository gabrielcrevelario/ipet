package com.ipet.crevelario.services;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ipet.crevelario.domain.Evaluation;
import com.ipet.crevelario.repositories.EvaluationRepository;

import reactor.core.publisher.Mono;

@Service
public class EvaluationService {
	@Autowired
	private EvaluationRepository evaluationRepository;

	public List<Evaluation> getAllByStoreId(String storeId) {
		return evaluationRepository.findAllEvaluationByStoreId(storeId);
	}

	public Mono<Evaluation> getById(String id) {
		return evaluationRepository.findById(id);
	}

	public Mono<Evaluation> create(Evaluation evaluation) {
		evaluation.setDateLog(new Date());
		return evaluationRepository.insert(evaluation);
	}

}
