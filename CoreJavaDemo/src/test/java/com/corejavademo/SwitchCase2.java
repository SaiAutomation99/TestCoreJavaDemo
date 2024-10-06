package com.corejavademo;

import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println("hello motto");
		
		Scanner sc=new Scanner(System.in);
		int x=10;
		int y=10;
		
		System.out.println("what is the value for 10+10");
		int xy=sc.nextInt();
		
		switch(xy){
			
		case 20:
			System.out.println("yes it is 20---correct answer");
			break;
			
		default:
			System.out.println("it is wrong answer");
			System.out.println("true");
		}
		sc.close();

	}

}
