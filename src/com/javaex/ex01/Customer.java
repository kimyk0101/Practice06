package com.javaex.ex01;

public class Customer extends Person{
	private int cNo;
	private int point;
	
	public Customer() {
		
	}
	public Customer(String name, String hp, int cNo, int point) {
		super(name, hp);
		this.cNo = cNo;
		this.point = point;
	}
	
	public int getCNo() {
		return cNo;
	}
	public void setCNo(int cNo) {
		this.cNo = cNo;
	}
	public int getPoint() {
		
	}
}
