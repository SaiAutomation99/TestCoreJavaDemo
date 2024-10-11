package com.modifier;

public class Childclass extends Modifier_Protected{
	
	public static void main(String[] args) {
		Modifier_Protected pro1=new Modifier_Protected();
		pro1.m1();
		
		Childclass childclass=new Childclass();
		childclass.m1();
		
		Modifier_Protected pro2=new Childclass();
		pro2.m1();
		
		//with in the same package though if we have protected method by using the extends keyword will can call it 
		//by using the parent reference child class object also it is valid and will be getting the output
		
	}
	
}
