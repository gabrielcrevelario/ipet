package com.ipet.crevelario.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="item_demand")
public class ItemDemand {
@Id
private String id;
private Product product;
private SystemService service;

public ItemDemand(String id, Product product, SystemService service) {
	super();
	this.id = id;
	this.product = product;
	this.service = service;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}
public SystemService getService() {
	return service;
}
public void setService(SystemService service) {
	this.service = service;
} 

}
