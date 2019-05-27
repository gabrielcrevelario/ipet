package com.ipet.crevelario.domain;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "client")
public class Client {
	@Id
	private String id;
	
	private String name;
	private String email;
	private String celular;
	@CPF
	private String cpf;
	public Client(String id, String name, String email, String celular, String cpf) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.celular = celular;
		this.cpf = cpf;
	}
	public Client() {}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
