package com.cg.dayone;

public class TypeCastingDemo {

	public static void main(String[] args) {
		
		//widening conversion(implicit casting)
		int myInt = 10;
		long myLong = myInt;
		System.out.println("Widening conversion : " +myLong);
		
		
		//narrowing conversion(explicit casting)
		double myDouble = 3.142678;
		int myInt1 = (int) myDouble;
		System.out.println("Narrowing conversion : " +myInt1);
		
	}

}
