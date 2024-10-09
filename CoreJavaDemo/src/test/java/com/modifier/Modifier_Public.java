package com.modifier;

import com.classname.ImplementDataHiding_Demo1;

public class Modifier_Public {

	public static void main(String[] args) {
		ModifierDemo test=new ModifierDemo();
		System.out.println(test.s);
		//public class since the modifier is public we are accessing in the other package as well.
		ImplementDataHiding_Demo1 test1=new ImplementDataHiding_Demo1();
		System.out.println(test1.getData());

	}

}
