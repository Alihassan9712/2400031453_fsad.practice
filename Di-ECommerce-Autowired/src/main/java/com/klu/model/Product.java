package com.klu.model;

import org.springframework.stereotype.Component;

@Component
public class Product {
	private int productId;
	private String productName;
	private double price;
	private String category;
	
	public Product() {
		this.productId=101;
		this.productName="Bike";
		this.price=150000.0907;
		this.category="Automobile";
	}
	
	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getCategory() {
		return category;
	}
	
	
}
