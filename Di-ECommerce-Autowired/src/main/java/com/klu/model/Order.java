package com.klu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order {
	private int orderId;
	private String customerName;
	private int quantity;
	
	@Autowired
	private Product product;
	
	
	public Order() {
		this.orderId=2001;
		this.customerName="Ali";
		this.quantity=421;
	}
	
	public void display() {
		System.out.println("the following are the order details of the customers");
		System.out.println("Order Id:"+orderId);
		System.out.println("Customer Name:"+customerName);
		System.out.println("Quantity:"+quantity);
		System.out.println("Product Id:"+product.getProductId());
		System.out.println("Product Name:"+product.getProductName());
		System.out.println("Product Price:"+product.getPrice());
		System.out.println("Product Category:"+product.getCategory()+"\n\n\n");
		
	}
}


