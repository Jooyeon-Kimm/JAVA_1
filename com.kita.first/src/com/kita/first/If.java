package com.kita.first;

public class If {
	public static void main(String[] args) {
		
		
		int n1 = 3;
		int n2 = 6;
		boolean isOdd = (n1 % 2 == 1) ? true : false;
		
		
//		if(조건식) {
//			실행 코드
//		}
		
		

		if(n1 % 2 == 1) {
			System.out.printf("%d은 홀수입니다.\n", n1);
		} else {
			System.out.printf("%d은 짝수입니다.\n", n1);
		}
		
		
		

		String oddNum;
		if(n1 % 2 == 1) {
			oddNum = "홀수";
		} else {
			oddNum = "짝수";
		}
		System.out.printf("%d은 %s입니다.\n", n1, oddNum);

		
	}
}
