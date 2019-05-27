package com.ipet.crevelario.domain;



import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="evaluation")
public class Evaluation {
	@Id
	private String id;
    
	private String description;
	
	private double note;
	
	private Client client;
	
	private Store store;
	
	private Date dateLog;

	public Evaluation(String id, String description, double note, Client client, Date dateLog) {
		super();
		this.id = id;
		this.description = description;
		this.note = note;
		this.client = client;
		this.dateLog = dateLog;
	}

	public String getId() {
		return id;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getNote() {
		return note;
	}

	public void setNote(double note) {
		this.note = note;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Date getDateLog() {
		return dateLog;
	}

	public void setDateLog(Date dateLog) {
		this.dateLog = dateLog;
	}

	
	
}
