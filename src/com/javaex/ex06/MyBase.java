package com.javaex.ex06;

public class MyBase extends Base{
	 
	public void service(String state) {
		
		
	        if (state.equals("낮")) { //문자열의 같다(==) 는 equals()를 사용합니다.
	        	println(state.day() + "에는 열심히 수업듣자");
	        } else if (state.equals("밤")) {
	            night();
	        } else {
	            afternoon();
	        } 
	    }
		 
    public void afternoon() {
        System.out.println("오후도 낮과 마찬가지로 공부해야 합니다");
    }
    
}
