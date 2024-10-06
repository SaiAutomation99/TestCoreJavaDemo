package com.corejavademo;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		
		//String s="jan";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the month name");
		String monthname= sc.next();
		switch(monthname) {
		case "jan": 
			System.out.println("jan");
			System.out.println("this should be executed");
			break;
			
		case "feb":
			System.out.println("feb");
			break;
			
		case "mar":
			System.out.println("mar");
			break;
			
			default: 
				System.out.println("default");
		}
		
        sc.close();
	}

}
