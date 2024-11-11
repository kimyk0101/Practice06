package com.javaex.ex05;

public class Depart extends Employee {

	private String department;
	
	public Depart(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department =  department;
	}
	
	@Override
	public void showInformation() {
		super.showInformation();
		System.out.println("부서:" + department);
	}	//	private이라 데이터를 가져올 수 없음
}
