package com.kita.first.practice;

import java.util.Scanner;

import com.kita.first.Scan;

public class Practice5 {
	public static void main(String[] args) {
		
//		수학 응시 유형을 입력해주세요: (가/나)
//		점수를 입력해주세요:
//		
//		가형 기준 : 60
//		나형 기준 : 70
//		
//		"평균 미만입니다."
//		"평균입니다."
//		"평균 초과입니다."
		
		
		/*
		// 1
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수학 응시 유형을 입력해주세요: ");
		String type = scan.next();
		
		System.out.print("점수를 입력해주세요: ");
		int score = scan.nextInt();
		

		
		if ("가".equals(type)) {
			if (score > 60) {
				System.out.println("평균 초과입니다.");
			} else if (score < 60) {
				System.out.println("평균 미만입니다.");
			} else {
				System.out.println("평균입니다.");
			}
		}
		
		else if ("나".equals(type)) {
			if (score > 70) {
				System.out.println("평균 초과입니다.");
			} else if (score < 70) {
				System.out.println("평균 미만입니다.");
			} else {
				System.out.println("평균입니다.");
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		
		
		
		// 2
		scan = new Scanner(System.in);
		System.out.print("수학 응시 유형을 입력해주세요: ");
		type = scan.next();
		System.out.print("점수를 입력해주세요: ");
		score = scan.nextInt();
		
		if("가".contentEquals(type)) {
			if(score > 60) {
				System.out.println("평균 초과입니다.");
			} else if (score <60) {
				System.out.println("평균 미만입니다.");
			} else {
				System.out.println("평균입니다.");
			}
		} else if("니".contentEquals(type)) {
			if(score > 70) {
				System.out.println("평균 초과입니다.");
			} else if (score <70) {
				System.out.println("평균 미만입니다.");
			} else {
				System.out.println("평균입니다.");
			}
		}
		
		
		*/
		
		// 3
		Scanner scan = new Scanner(System.in);
		System.out.print("수학 응시 유형을 입력해주세요: ");
		String type = scan.next();

		
		int average = 70;
		if("가".contentEquals(type) || "나".contentEquals(type)) {
			System.out.print("점수를 입력해주세요: ");
			int score = scan.nextInt();
			if("가".contentEquals(type)) {
				average = 60;
			}
			
			if (score > average) {
				System.out.println("평균 초과입니다.");			
			} else if (score < average)  {
				System.out.println("평균 미만입니다.");
			} else {
				System.out.println("평균입니다.");
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		scan.close();
	}
		
	
		
		

	
	
}
