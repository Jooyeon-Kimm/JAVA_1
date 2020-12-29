package com.kita.first;

public class Operator6 {
	public static void main(String[] args) {
		// 비교 : == , !=, >=, <=, >, <
		// 논리 : !, &, |, &&, ||
		int n1 = 5;
		int n2 = 5;
		int n3 = 6;
		
		// & 하나만 쓰면 뒤까지 모두 연산한다. 비효율적
		boolean result1 = (n1 >= n2 && n1 != n3 && n2 == n3);	// false
		boolean result2 = (n1 == n2 || n1 == n3 || n2 == n3);	// true

		
		System.out.println(!result1);	// true
		System.out.println(!!result2);	// true

		
		
	}
}
