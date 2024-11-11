package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		Customer c = new Customer("jws", "j1234", "정우성", 1000);
		Customer u = new Customer("yjs", "y2345", "이효리", 2000);
		Employee e = new Employee("master", "m7788", "운영자", 500);
		
		
		User arr[] = new User[3];
		
	
		for (int i = 0; i < arr.length; ++i) {
			if (i == 0) {
				c.showInfo();
				} else if (i == 1) {
					u.showInfo();
				} else {
					e.showInfo();
				}
			
		}
		System.out.println("운영자의 월급은 5000000원 입니다.");
	}

}
