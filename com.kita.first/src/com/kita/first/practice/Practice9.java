package com.kita.first.practice;

import java.util.Scanner;

public class Practice9 {
		public static void main(String[] args) {
				
				System.out.print("점수를 입력해주세요: ");
				Scanner scan = new Scanner(System.in);
				int score = scan.nextInt();
				
				char mark = ' ';
				char pm = ' ';
				
				if (score > 100) {
					System.out.println("잘못 입력하셨습니다.");
					return;		// 메소드를 종료
				} else if (score >= 90) {
					mark = 'A';
				} else if (score >= 80) {
					mark = 'B';
				} else if (score >= 70) {
					mark = 'C';
				} else {
					mark = 'D';
				}
				
		
				
				if (mark != 'D') {	// if (score >= 70)
					if (score == 100) {
						pm = '+';
					} else {
						if (score%10 >= 7) {
							pm = '+';
						} else if (score%10 >= 3) {
							pm = ' ';
						} else {
							pm = '-';
						}
					}
				} 
				
				
				System.out.printf("%s%s", mark, pm);
				
				
				/*
			if (mark != 'D') {	
				switch (score%10){
				case 7: case 8: case 9:
					pm =  '+';
					break;
				case 0: case 1: case 2:
					pm = '-';
					break;
				}
			}
			*/
				
				
				/*
				if (num > 100 || num < 0) {
					System.out.println("잘못 입력하였습니다.");
					return;
				} else if (num < 70) {
					System.out.print("D");
				} else if(num <80) {
					System.out.print("C");
				} else if(num <90) {
					System.out.print("B");
				} else{
					System.out.print("A");
				}
				*/
			}
	}
		
