package com.ipet.crevelario.domain;



import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.ipet.crevelario.domain.enums.AccountTypeEnum;

@Document(collection="user")
public class User {
    @Id
	private String id;
    
    private String name; 

	private String lastName;

	private String email;

	private String password;
	
	private AccountTypeEnum accountType;

	@DBRef(lazy = true)
	private List<Product> products = new ArrayList<>();
	
	public User(String id, String name, String lastName, String email, String password,
			AccountTypeEnum accountType) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.accountType = accountType;
	}
    public User() {}
    
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public List<Product> getProduct() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AccountTypeEnum getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountTypeEnum accountType) {
		this.accountType = accountType;
	}
}
