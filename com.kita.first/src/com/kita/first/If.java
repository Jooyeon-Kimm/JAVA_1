package com.kita.first;

import com.sun.tools.sjavac.server.SysInfo;

public class If {
	public static void main(String[] args) {
		
		
		int n1 = 3;
		int n2 = 6;
		boolean isOdd = (n1 % 2 == 1) ? true : false;
		
		
//		if(조건식) {
//			실행 코드
//		}
		
		

//		1
		if(n1 % 2 == 1) {
			System.out.printf("%d은 홀수입니다.\n", n1);
		} else {
			System.out.printf("%d은 짝수입니다.\n", n1);
		}
		
		
		
//		2
		String oddNum;
		
		if(n1 % 2 == 1) {
			oddNum = "홀수";
		} else {
			oddNum = "짝수";
		}
		System.out.printf("%d은 %s입니다.\n", n1, oddNum);
		
		
		
		
//		3	
		oddNum = "짝수";
		
		if(n1 % 2 == 1) {
			oddNum = "홀수";
		}
		System.out.printf("%d은 %s입니다.\n", n1, oddNum);

		
		
		
//		if ~ else if ~ else 문
		
/*		if() {
 *			
 *		} else if() {
 *		
 *		} else {
 *		
 *		}
 */

		
		// 효율적 -> 확률이 높은 것 먼저 조건으로 사용	(순차적 실행)
		if (n1 > n2) {
			System.out.println("n1이 n2보다 크다.");
		} else if (n1 < n2) {
			System.out.println("n1이 n2보다 작다.");
		} else {
			System.out.println("n1과 n2가 같다.");
		}
		
		
		
		
		
		
		
	}
}
