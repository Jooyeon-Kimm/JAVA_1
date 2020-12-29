package com.kita.first.practice;

public class Practice3 {
	public static void main(String[] args) {
		
		// n1 (연산자=) n2
		int n1 = 10;
		int n2 = 3;
		
		int result1 = (n1 += n2);
		n1 = 10;	// n1 리셋
		
		int result2 = (n1 -= n2);
		n1 = 10;
		
		int result3 = (n1 *= n2);
		n1 = 10;
		
		int result4 = (n1 /= n2);
		n1 = 10;
		
		n1 %= n2;
		int result5 = n1;

	
		System.out.println(result1);	// 10 + 3 == 13
		System.out.println(result2);	// 10 - 3 == 7
		System.out.println(result3);	// 10 * 3 == 30
		System.out.println(result4);	// 10 / 3 == 3
		System.out.println(result5);	// 10 % 3 == 1
		
		/*
		 *  int result;
		 *  result += n1;	// 오류 : result 값이 없어서 더할 수 X
		 */
	}
}
