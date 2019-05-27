package com.ipet.crevelario.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ipet.crevelario.domain.Store;
import com.ipet.crevelario.domain.User;
import com.ipet.crevelario.repositories.StoreRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class StoreService {

	@Autowired
	private StoreRepository storeRepository;
	
	@Autowired
	private UserService userService;
	
	public Flux<Store> getAll() {
		return storeRepository.findAll();
	}
	public Mono<Store> getById(String id) {
		return storeRepository.findById(id);
	}
	public Mono<Store> create(Store store) {
	Mono<User> user =  userService.getById(store.getUser().getId());
		if(user == null) {
			return null;
		}
		return storeRepository.insert(store);
	}
	
	public Mono<Store> update (String id, Store store) {
		Mono<User> user =  userService.getById(store.getUser().getId());
			if(user == null) {
				return null;
			}
			store.setId(id);
			return storeRepository.save(store);
		}
	public void remove(String id) {
		storeRepository.deleteById(id);
	}

}
