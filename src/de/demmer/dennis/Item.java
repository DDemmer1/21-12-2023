package de.demmer.dennis;

public class Item {
	
	
	//Attribute, Eigenschaften, Felder (fields)
	double price;
	int id;
	String name;
	String description;
	
	
	public Item(String name) {
		this.name = name;	
	}


	public Item(double price, int id, String name, String description) {
		this.price = price;
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	
	public String printInfo() {
		
		
		return "[price= " +  price + ", id= " 
		+ id + ", name= " + name + ", description= " + description + "]";
	}
	
	
	
	

}
