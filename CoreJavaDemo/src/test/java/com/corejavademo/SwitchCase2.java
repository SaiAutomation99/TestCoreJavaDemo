package com.corejavademo;

import java.util.Scanner;


//allowed data types for the switch statement
//byte, short,char ,int - 1.4v
//byte,shorrt,Character,Integer,enum  - 1.5v
//byte,short,Character,Integer,String   - 1.7v

//Not Allowed Data types
//boolean, long,float,double


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
