package com.ipet.crevelario.resource;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipet.crevelario.domain.Evaluation;
import com.ipet.crevelario.services.EvaluationService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value="/evaluations")
public class EvaluationResource {
	@Autowired
	private EvaluationService evaluationService;

	@GetMapping(value = "/storeid/{storeId}")
	public ResponseEntity<List<Evaluation>> getAll(@PathVariable String storeId) {
		return ResponseEntity.ok(evaluationService.getAllByStoreId(storeId));
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Mono<Evaluation>> getById(@PathVariable String id) {
		return ResponseEntity.ok(evaluationService.getById(id));
	}	

	@PostMapping
	public ResponseEntity<Mono<Evaluation>> create(@RequestBody Evaluation evaluation) {
		return ResponseEntity.status(HttpStatus.CREATED).body(evaluationService.create(evaluation));
	}
}
