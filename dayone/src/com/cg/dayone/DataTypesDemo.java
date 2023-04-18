package com.cg.dayone;

public class DataTypesDemo {

	public static void main(String[] args) {
		
		//string is non primitive data type
		String str = "alexander";
		System.out.println("Name: " +str);
		
		//byte value minimum= -128  max = 127
		byte b =125;
		System.out.println("Emp id: " +b);
		
		//short value minimum= -32768  max = 32767
		short s = 54;
		System.out.println("Age: " +s);
		
		//int value minimum = -2147483648  and max = 2147483647
		int i = 258004;
		System.out.println("salary: " +i);
		
		char c = 'B';
		System.out.println("dept: " +c);
		
		long l = 9876543210L;
		System.out.println("Phone no.: " +l);
		
		//float stores 6-7 decimal digits
		float f = 5.13789f;
		System.out.println("salary increment: " +f);
		
		//double stores up to 15 decimal digits
		double d = 5.137893693764;
		System.out.println("Total salary increment: " +d);
		
		boolean myBoolean = true;
		System.out.println("salary received: " +myBoolean);
		
	}

}
