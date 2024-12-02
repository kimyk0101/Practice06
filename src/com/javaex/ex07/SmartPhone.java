package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        if ("앱".equals(str)) {
        	playApp();
        } else {
        	super.execute(str);
        }
        
        
    }
 
    protected void playApp() {
    	System.out.println("앱 실행");
    }
    
    
}
