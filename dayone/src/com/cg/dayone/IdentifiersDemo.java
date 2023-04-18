package com.cg.dayone;

public class IdentifiersDemo {

	public static void main(String[] args) {
		//name should not start with number
		//cannot use keyword as identifies
		//no white spaces
		//special character cannot be used except $ and _
		
		int a=10;
		int _b = 20;
		int $c = 30;
		int camelCase = 40;
		int thisIsALongIdentifier = 50;
		System.out.println("identifiers : " +a+" "+_b+" " +$c+" "+camelCase+" " +thisIsALongIdentifier);
		

	}

}
