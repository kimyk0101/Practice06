package com.javaex.ex06;

public class MyBase extends Base{
	 
	public void service(String state) {
		
		
	        if (state.equals("오후")) { 
	        	afternoon();
	        } else if (state.equals("밤")) {
	            night();
	        } else {
	        	day();
	        } 
	    }
		 
	//	Base 클래스를 수정 할 수 없으므로 부모 클래스에 메서드가 있지만 사용하지 않고 자식 클래스의 메서드를 사용
	@Override
	public void day() {
		System.out.println("낮에는 열심히 수업듣자");
	}
	
    public void afternoon() {
        System.out.println("오후도 낮과 마찬가지로 공부해야 합니다");
    }
    
}
