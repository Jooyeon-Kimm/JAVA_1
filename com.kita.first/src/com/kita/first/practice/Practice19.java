package com.kita.first.practice;

import java.util.Scanner;

public class Practice19 {
	public static void main(String[] args) {
		
//		합 계산기 만들기
//		숫자를 입력하세요 (0 입력 시 종료): 1
//		숫자를 입력하세요 (0 입력 시 종료): 3
//		숫자를 입력하세요 (0 입력 시 종료): 7
//		숫자를 입력하세요 (0 입력 시 종료): 2
//		숫자를 입력하세요 (0 입력 시 종료): 0
//		합계: 13
		

		int total = 0;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자를 입력하세요 (0 입력 시 종료): ");
			int num = scan.nextInt();

			if (num == 0) {
				break;
			}
			total += num;
		}
		scan.close();
		System.out.printf("합계: %d", total);
		
		
	
		
		
		
	}
}
