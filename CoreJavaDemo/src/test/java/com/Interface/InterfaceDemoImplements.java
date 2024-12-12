package com.Interface;

public class InterfaceDemoImplements implements InterfaceDemo{
	
	public void studentDetails() {
		
		System.out.println("hello this are the student details");
		
	}
	public static void main(String[] args) {
		InterfaceDemoImplements demo=new InterfaceDemoImplements();
		demo.studentDetails();
		System.out.println(demo.str);
		
	}
	

}
