package com.ipet.crevelario.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="address")
public class Address {
	
@Id
private String id;

private String country;

private String city;

private String street;

private String district;

private int number;

public Address() {
}
public Address(String id, String country, String city, String street, String district, int number) {
	super();
	this.id = id;
	this.country = country;
	this.city = city;
	this.street = street;
	this.district = district;
	this.number = number;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getDistrict() {
	return district;
}
public void setDistrict(String district) {
	this.district = district;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}


}
