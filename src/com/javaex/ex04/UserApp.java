package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		Customer c = new Customer("jws", "j1234", "정우성", 1000);
		Customer u = new Customer("yjs", "y2345", "이효리", 2000);
		Employee e = new Employee("master", "m7788", "운영자", 500);
		
		
		User arr[] = new User[] {c,u,e};
		int j = 0;	
		
		for (int i = 0; i < arr.length; ++i) {
			arr[i].showInfo();
			
			if (arr[i] instanceof Employee) {	//	arr[]는 현재 User이므로 Employee의 값을 가져오기 위해서는 다운캐스팅 필요, 설계도를 User에서 Employee로
				Employee other = (Employee)arr[i];	//	other에 다운캐스팅한 Employee 할당
				j = other.getSalary();	//	주어.동사라고 생각하기 (other에게 salary 값 달라고 하기)
			}
			
		}
		System.out.println("운영자의 월급은 " + j*10000 + "원 입니다.");
	}

}
