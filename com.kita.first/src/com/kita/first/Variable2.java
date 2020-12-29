package com.kita.first;

public class Variable2 {
	public static void main(String[] args) {
		int num = 5_000_000;
		System.out.println(num);
		

		int n1 = 10;
		long n2 = 20;
		
		// int + long -> long
		long result1 = n1 + n2;
		System.out.println(result1);
		
		// int result2 = n1 + n2;
		// Type mismatch: cannot convert from long to int
		
		int result2 = (int) (n1 + n2);
		System.out.println(result2);
	}

}
