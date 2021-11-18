package com.basic;

public class Adding {
	static int d=9;
	void staticVariable(){
		d=10;
		int z=100;
		System.out.println("Local Variable is " +z);
	}
	
	void display(){
		
		System.out.println("Static Value is " + d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub // Instance variables
		int a = 10;
		int b = 10;
		int c = a+b;
		System.out.println("Example of Instance variables \n");
		System.out.println("The Instance Value is "+c);
		Adding aa = new Adding();
		d=20;
		aa.display();
		aa.staticVariable();
		
	}
	
	

}
