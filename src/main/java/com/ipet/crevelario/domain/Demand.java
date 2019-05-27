package com.ipet.crevelario.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.ipet.crevelario.domain.enums.StatusDemandEnum;

@Document(collection = "demand")
public class Demand {
	@Id
	private String id;
	private Date dateLog;
	private double price;
	@DBRef(lazy = true)
	private Store store;
	@DBRef(lazy = true)
	private Client client;
	@DBRef(lazy = true)
    private List<ItemDemand> items = new ArrayList<>();
    private StatusDemandEnum statusDemand;
	
	public StatusDemandEnum getStatusDemand() {
		return statusDemand;
	}
	public void setStatusDemand(StatusDemandEnum statusDemand) {
		this.statusDemand = statusDemand;
	}
	@DBRef(lazy = true)
	private Evaluation evaluation;
	
	public Demand(String id, Date dateLog, double price, Store store, Client client,Evaluation evaluation) {
		super();
		this.id = id;
		this.dateLog = dateLog;
		this.price = price;
		this.store = store;
		this.client = client;
		this.evaluation = evaluation;
	}
	public Demand() {}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getDateLog() {
		return dateLog;
	}
	public void setDateLog(Date dateLog) {
		this.dateLog = dateLog;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Store getStore() {
		return store;
	}
	public void setStore(Store store) {
		this.store = store;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}


	public List<ItemDemand> getItems() {
		return items;
	}
	public void setItems(List<ItemDemand> items) {
		this.items = items;
	}
	public Evaluation getEvaluation() {
		return evaluation;
	}
	public void setEvaluation(Evaluation evaluation) {
		this.evaluation = evaluation;
	}
	
}
