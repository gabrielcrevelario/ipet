package com.ipet.crevelario.services;

import org.springframework.stereotype.Service;

import com.ipet.crevelario.domain.Address;
import com.ipet.crevelario.repositories.AddressRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AddressService {


	private final AddressRepository addressRepository;

	public AddressService(AddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}

	public Flux<Address> getAll() {
		return addressRepository.findAll();
	}

	public Mono<Address> getById(String id) {
		return addressRepository.findById(id);
	}

	public Mono<Address> create(Address address) {
		return addressRepository.insert(address);
	}
	
	public Mono<Address> update(String id, Address address) {
		address.setId(id);
		return addressRepository.save(address);
	}


}
