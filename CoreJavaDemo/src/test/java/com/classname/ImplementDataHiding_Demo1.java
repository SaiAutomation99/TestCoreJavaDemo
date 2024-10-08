package com.classname;

public class ImplementDataHiding_Demo1 {
	
	private double data=25.12;
	
	public double getData() {
		
		return data;
	}
	
	public void setData(double setdata) {
		this.data=setdata;
		
	}

	public static void main(String[] args) {
		
		ImplementDataHiding_Demo1 obj=new ImplementDataHiding_Demo1();
		
		double actuabalance=obj.getData();
		System.out.println("first balance   "+actuabalance);  //25.12
		
		obj.setData(100);
		System.out.println("updated data    "+obj.getData());  //100

	}

}
