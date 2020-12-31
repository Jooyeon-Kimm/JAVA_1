package com.kita.first.practice;

public class Practice7 {
	public static void main(String[] args) {
		
		// 1 ~ 6 ÃÑ 6°³ÀÇ ¸Þ´º ·£´ý »Ì±â
		int rNum = (int) (Math.random() * 6 + 1);
		String menu;
		
		if (rNum == 1) { 
			menu= "Ä¡Å²";
		}
		
		else if (rNum == 2 || rNum == 4) {
			menu = "ÇÜ¹ö°Å";
		}
		
		else if (rNum == 3) {
			menu = "Á·¹ß";
		}
		
		else if (rNum == 5) {
			menu = "¸·±¹¼ö";
		}
		
		else {
			menu = "¸¶¶óÅÁ";
		}
		
		System.out.printf("%s ¸Ô°í ½Í´Ù....", menu);
		
	}
}
