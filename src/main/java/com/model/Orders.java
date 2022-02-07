package com.model;

public class Orders {
	private String orderNames;
	public Orders() {
		
	}
	
	
	public Orders(String orderNames) {
		super();
		this.orderNames = orderNames;
	}


	public String getOrderNames() {
		return orderNames;
	}
	public void setOrderNames(String orderNames) {
		this.orderNames = orderNames;
	}


	@Override
	public String toString() {
		return (orderNames + " ") ;
	}
	
	
	

}
