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
		}
		
		System.out.printf("%d월은  %s입니다.", month, season);
		
		scan.close();
		
	}
}
