package com.kita.first;

public class Operator4 {
	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 3;
		
		double result1 =  (double)n1 /n2;	// n2 자동으로 실수화됨
		float result2 = (float)n1 / n2;		// n2 자동으로 실수화됨
		double result3 = (double)(n1 / n2);	// 정수를 실수화
		
		int result4 = n1 / n2;				// n1을 n2로 나눈 >>몫<<
		int result5 = n1 % n2;				// n1을 n2로 나눈 >>나머지<<	// 홀짝 구분, 배수
		
		
		System.out.println(result1);		// 3.3333333333333335
		System.out.println(result2);		// 3.3333333
		System.out.println(result3+ "\n");	// 3.0
		
		System.out.println(result4);		// 3
		System.out.println(result5);		// 1
		
		
	}

}
