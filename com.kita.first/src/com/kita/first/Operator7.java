package com.kita.first;

public class Operator7 {
	public static void main(String[] args) {
		
		int n1 = 3;
		int n2 = 5;
		boolean result1 = (n1 > n2);
		System.out.println(result1);		// false
		
		
		String str1 = "안녕1";
		String str2 = "안녕2";
		boolean result2 = (str1 == str2);	// false
		System.out.println(result2);
		
		// The operator > is undefined for the argument type(s) 
		// java.lang.String, java.lang.String
		
		
		boolean result3 = "안녕1".equals(str2);	// 변수를 equals 뒤에 두면 더 안정적
		System.out.println(result3);			// false
	}
}
