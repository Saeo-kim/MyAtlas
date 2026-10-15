package com.atlas;

//child class: cloth product (Cloth->Product)
public class Clothes extends Product {
	private String size; //Sizes(Child Only)
	
	//Child Constructor
	public Clothes(String name, int price, String size) {
		super(name, price); //Pass the name and price to the parent constructor using super()!
		this.size = size; // Initialize my size variable
	}

	
	// Override the parent's getInfo() method to fit my needs
	@Override
	public String getInfo() {
		// Using super.getInfo(), you can use the basic information ("product name, price") created by the parent class as it is.
		return super.getInfo() + ", Size: " + this.size;
	}
}
