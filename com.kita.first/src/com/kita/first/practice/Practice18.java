package com.kita.first.practice;

public class Practice18 {
	public static void main(String[] args) {
		
		int i = 1;
		int dan = 4;
		
//		4 * 1 = 4
//		4 * 2 = 8
//		4 * 3 = 12
//		4 * 4 = 16
//		4 * 5 = 20
//		4 * 6 = 24
//		4 * 7 = 28
//		4 * 8 = 32
//		4 * 9 = 36
				
		for(i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
		
		while(i<=9) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
			i++;
		}
		
	}
}
