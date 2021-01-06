package com.kita.first.practice;

import java.util.Scanner;

public class Practice16 {
	public static void main(String[] args) {
		
//		1 ~ 6 총 6개의 메뉴 랜덤 뽑기 한 번 한 후에
//		뽑힌 메뉴: oo
//		마음에 들면  Y 눌러서 반복 끝내고
//		"오늘의 메뉴는 oo입니다."
//		마음에 안 들면 N 눌러서 다시 랜덤 뽑기
		
		Scanner scan = new Scanner(System.in);
		String menu;
		boolean again = true;
		
		// 메뉴 뽑기
		do {
			int rNum = (int) (Math.random() * 6 + 1);
			if (rNum == 1) { 
				menu= "치킨";
			}else if (rNum == 2 || rNum == 4) {
				menu = "햄버거";
			}else if (rNum == 3) {
				menu = "족발";
			}else if (rNum == 5) {
				menu = "막국수";
			}else {
				menu = "마라탕";
			}
			System.out.println("뽑힌 메뉴: " + menu);
			System.out.print("마음에 듭니까?(Y/N) ");
			String result = scan.next();
			System.out.println();
			
			
			if("Y".contentEquals(result) || "N".contentEquals(result)) {
				if("Y".contentEquals(result)) {
					System.out.printf("오늘의 메뉴는 %s입니다.", menu);
					break;
				} else if( "N".contentEquals(result)) {
					continue;
				}
			} else {
				System.out.println("[잘못입력하셨습니다] 메뉴를 다시 뽑습니다.\n");
				// break;
			}
		} while(again);		// 마음에 드는 지 안드는 지
		
		scan.close();
		
		/*
		switch(result) {
		case "Y":
			break;
		default: 
			System.out.println("메뉴를 다시 뽑습니다.");
			*/
	}
}

