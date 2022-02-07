package com.model;

import java.util.List;

public class Customer {
	private int adhaar;
	private String cname;
	private String address;
	private int phone;
	public Bill b;
	public List<Orders> list;
	
	
	public Bill getB() {
		return b;
	}
	public void setB(Bill b) {
		this.b = b;
	}
	
	public Customer(int adhaar, String cname, String address, int phone, Bill b, List<Orders> list) {
		super();
		this.adhaar = adhaar;
		this.cname = cname;
		this.address = address;
		this.phone = phone;
		this.b = b;
		this.list = list;
	}
	public List<Orders> getList() {
		return list;
	}
	public void setList(List<Orders> list) {
		this.list = list;
	}
	public Customer(List<Orders> list) {
		super();
		this.list = list;
	}
	public Customer() {
	System.out.println("I am in Dedault");
	}
	public Customer(int adhaar, String cname, String address, int phone, Bill b) {
		super();
		this.adhaar = adhaar;
		this.cname = cname;
		this.address = address;
		this.phone = phone;
		this.b = b;
	}
	public Customer(Bill b) {
		super();
		this.b = b;
	}
	public Customer(int adhaar, String cname, String address, int phone) {
		super();
		System.out.println("I am in Param");
		this.adhaar = adhaar;
		this.cname = cname;
		this.address = address;
		this.phone = phone;
	}
	public int getAdhaar() {
		
		return adhaar;
	}
	public void setAdhaar(int adhaar) {
		System.out.println("i am in setter");
		this.adhaar = adhaar;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return ("Customer adhaar = " + adhaar + "\nCustomer name = " + cname + "\nCustomer address = " + address + "\nCutomer phone = " 
	+ phone +"\n"+ b + "\n" + "List of Orders = " + list);
	}
	

}
