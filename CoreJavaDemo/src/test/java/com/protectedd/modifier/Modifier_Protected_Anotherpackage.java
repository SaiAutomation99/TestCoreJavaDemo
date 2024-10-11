package com.protectedd.modifier;

import com.modifier.Modifier_Protected;

public class Modifier_Protected_Anotherpackage extends Modifier_Protected {

	public static void main(String[] args) {
		//we will get compile time error for this because if the method is protected we can access if we create object for the parent class
//		Modifier_Protected partentclass=new Modifier_Protected();
//		partentclass.m1();
//		
		Modifier_Protected_Anotherpackage child=new Modifier_Protected_Anotherpackage();
		child.m1();
		
		//we will get compile time error bevcause we are trying to access parent reference with child object 
		//Modifier_Protected parentp1=new Modifier_Protected_Anotherpackage();
		//parentp1.m1();
		
	}

}
