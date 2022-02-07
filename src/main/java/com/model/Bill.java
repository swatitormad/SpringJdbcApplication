package com.model;

public class Bill {
	private int bno;
	private String billname;
	public Bill() {
		super();
	}
	public Bill(int bno, String billname) {
		super();
		this.bno = bno;
		this.billname = billname;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getBillname() {
		return billname;
	}
	public void setBillname(String billname) {
		this.billname = billname;
	}
	@Override
	public String toString() {
		return ("Bill no = " + bno + "  "+"Bill name = " + billname );
	}
	
	
}
