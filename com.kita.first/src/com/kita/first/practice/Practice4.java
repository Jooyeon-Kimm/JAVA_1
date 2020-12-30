package com.kita.first.practice;

import java.util.Scanner;	// java.util 안에 있는 Scanner Class를 델꼬왔다!

public class Practice4 {
	public static void main(String[] args) {
		
//		java.util.Scanner scan = new java.util.Scanner(System.in);
		
//		스캐너로 정수값 하나 입력받고
//		그 값이 홀수이면 "홀수입니다."
//		그 값이 짝수이면 "짝수입니다."
		
		
		Scanner scan = new Scanner(System.in);	// 노란줄 : 선언해놓고 안쓸 때, 데이터 입출력 메모리 많이 사용됨
		int num = scan.nextInt();				// Error: input mismatch -> try/catch
		
		
		String is = "짝수";
		if(num % 2 == 1) { is = "홀수"; }
		System.out.printf("%d : %s입니다.", num, is);

		
		scan.close();	//scan의 close 메소드로 닫아준다!
	}
}
