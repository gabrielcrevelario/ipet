package com.ipet.crevelario.services;


import org.springframework.stereotype.Service;

import com.ipet.crevelario.domain.Demand;
import com.ipet.crevelario.domain.enums.*;
import com.ipet.crevelario.repositories.DemandRepository;

import reactor.core.publisher.Mono;

@Service
public class DemandService {


	private final DemandRepository demandRepository;

	public DemandService( DemandRepository demandRepository) {
		 this.demandRepository = demandRepository;
	}
	public Mono<Demand> create(Demand demand) {
		if(demand.getClient() != null) {
		demand.setStatusDemand(StatusDemandEnum.INITIALIZED);
		}
		return demandRepository.insert(demand);
	
	}

	public Mono<Demand> update(String id, Demand demand) {
		if (demand.getStatusDemand() != StatusDemandEnum.CONCRETIZED
				|| demand.getStatusDemand() == StatusDemandEnum.CANCELED) {
			demand.setId(id);
			demand.setStatusDemand(StatusDemandEnum.PENDING);
			return demandRepository.save(demand);
		}else if(demand.getStatusDemand() != StatusDemandEnum.CONCRETIZED) {
			demand.setId(id);
			return demandRepository.save(demand);
		}
		return null;
	}
}
