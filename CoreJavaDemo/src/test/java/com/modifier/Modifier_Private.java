package com.modifier;

public class Modifier_Private {

//private method we can access with in the same class and not visible to the another call though we create a object for that call
	private void m1() {


		System.out.println("private m1 method");
	}
	//since this is a public method we can access in any of the package and it is visible if you create a object for it
	public void m2() {


		System.out.println("public m2 method");
	}

	public static void main(String[] args) {

		Modifier_Private p=new Modifier_Private();
		p.m1();

	}

}
