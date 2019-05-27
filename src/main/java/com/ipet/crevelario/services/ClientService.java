package com.ipet.crevelario.services;

import org.springframework.stereotype.Service;
import com.ipet.crevelario.domain.Client;
import com.ipet.crevelario.repositories.ClientRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientService {
	
	private final ClientRepository clientRepository;

	public ClientService(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}
	
	public Flux<Client> getAll() {
		return clientRepository.findAll();
	}

	public Mono<Client> getById(String id) {
		return clientRepository.findById(id);
	}

	public Mono<Client> create(Client client) {
		return clientRepository.insert(client);
	}
	
	public Mono<Client> update(String id, Client client) {
		client.setId(id);
		return clientRepository.save(client);
	}

}
