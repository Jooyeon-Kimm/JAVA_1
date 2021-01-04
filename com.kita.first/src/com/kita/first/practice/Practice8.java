package com.kita.first.practice;

import java.util.Scanner;

public class Practice8 {
	public static void main(String[] args) {
		
		/*
		 * 1 ~ 12 월
		 * 3 ~ 5월  : 봄
		 * 6 ~ 8월  : 여름
		 * 9 ~ 11월: 가을
		 * 12 ~ 2월: 겨울
		 * 
		 * n월은 oo입니다.
		 */
		
		
		/* 1
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		String season = "겨울";
		
		
		switch(month) {
		case 3: case 4: case 5:
			season = "봄";
			break;
		case 6: case 7: case 8:
			season = "여름";
			break;
		case 9: case 10: case 11:
			season = "가을";
			break;
		default:
			season = "겨울";
		} System.out.printf("%d월은  %s입니다.", month, season);
		*/
		
		
		
		
		/* 2
		Scanner scan = new Scanner(System.in);
		String month = scan.next();
		int monthNum = Integer.parseInt(month);		// String 을 int로 변환하자
		String season = "겨울";
		
		if ( 3<= monthNum && monthNum <= 5) {		// 2 < monthNum && monthNum < 6
			season = "봄";
		} else if (6 <= monthNum && monthNum <= 8) {
			season = "여름";
		} else if (9 <= monthNum && monthNum <= 11) {
			season = "가을";
		} System.out.printf("%d월은  %s입니다.", monthNum, season);

		
		scan.close();
		*/
		
		
		
		//3
		Scanner scan = new Scanner(System.in);
		String month = scan.next();
		int monthNum = Integer.parseInt(month);		// String 을 int로 변환하자
		
		if ( 3<= monthNum && monthNum <= 5) {
			System.out.printf("%d월은  봄입니다.", monthNum);
		} else if (6 <= monthNum && monthNum <= 8) {
			System.out.printf("%d월은  여름입니다.", monthNum);
		} else if (9 <= monthNum && monthNum <= 11) {
			System.out.printf("%d월은  가을입니다.", monthNum);
		} else if (monthNum == 12 || monthNum == 1 || monthNum == 2) {
			System.out.printf("%d월은  겨울입니다.", monthNum);
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

		
		scan.close();
	}
}
