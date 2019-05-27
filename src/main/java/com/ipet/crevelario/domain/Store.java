package com.ipet.crevelario.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "store")
public class Store {
	@Id
	private String id;
	private String title;
	private String description;
	@DBRef(lazy = true)
	private User user;
	@DBRef(lazy = true)
	private List<Product> products = new ArrayList<>();
	@DBRef(lazy = true)
	private List<Evaluation> evaluations = new ArrayList<>();
	
	public Store(String id, String title, String description, List<Product> products,
			List<Evaluation> evaluations) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.products = products;
		this.evaluations = evaluations;
	}
	public Store() {}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public List<Evaluation> getEvaluations() {
		return evaluations;
	}
	public void setEvaluations(List<Evaluation> evaluations) {
		this.evaluations = evaluations;
	}

}
