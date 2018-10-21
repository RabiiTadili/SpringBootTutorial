package com.rabii.demo.model;

public class Product {
	
	
private String id;
private String Name;



public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(String id, String name) {
	super();
	this.id = id;
	Name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}


}
