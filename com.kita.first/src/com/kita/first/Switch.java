package com.kita.first;

public class Switch {
	public static void main(String[] args) {
		
		// 1 ~ 6 총 6개의 메뉴 랜덤 뽑기
		// 줄맞추기 : Shift + Tab, Tab
		
		int rNum = (int) (Math.random() * 6 + 1);
		String menu;
		
		switch(rNum) {
		case 1:
			menu = "한식"; 
			break;
		case 2: case 4:
			menu = "양식";
			break;
		case 3:
			menu = "일식";
			break;
		default:
			menu = "치킨";
		}
		
		System.out.printf("오늘의 메뉴는 %s입니다.", menu);
		
	}
}
