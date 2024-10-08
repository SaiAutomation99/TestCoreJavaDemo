package com.classname;

import java.util.Scanner;

public class ImplementDataHiding_Demo2 {
	
	
	 private double balance;
	 
	 public ImplementDataHiding_Demo2(double balance) {
		 this.balance=balance;
		 
	 }
	 
	 public double getBalance() {
		 
		 return balance;
		 
	 }
	 public void setBalance(double balance) {
		 
		 this.balance=balance;	 
	 }

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the username");
		String username=sc.next();
		System.out.println("enter the passcode");
		String password=sc.next();
		ImplementDataHiding_Demo2 obj=null;
		if(username.equals("sai")&& password.equals("1234")) {
			obj=new ImplementDataHiding_Demo2(0.00);
			System.out.println(obj.getBalance());
			System.out.println("enter the cash you need to deposite");
			double deposite=sc.nextDouble();
			//System.out.println(obj.getBalance());
			obj.setBalance(deposite);
			System.out.println("updated balance"+obj.getBalance());
		}else {
			System.out.println("username is invalid");
		}
		sc.close();

	}

}
