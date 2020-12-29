package com.kita.first.practice;

public class Practice2 {
	public static void main(String[] args) {
		
		/*
		 * name
		 * age
		 * vision
		 * bloodType
		 * 
		 * 제 이름은 OOO이고 나이는 OO살입니다.
		 * 시력은 O.O이고 혈액형은 O입니다.
		 */
		
		String name = "Joo";
		int age = 64;
		float vision = 1.2f;	// double vision = 1.5;
		char bloodType = 'A';	// String bloodType = "AB";
		
		
		// print, println
		System.out.print("제 이름은 " +name+ "이고 나이는 " +age+ "살입니다.\n");	// int가 문자열화 된다.
		System.out.println("시력은 " +vision+ "이고 혈액형은 " +bloodType+ "입니다.\n");
		
		
		// printf
		System.out.printf("제 이름은 %s이고 나이는 %d살입니다.\n시력은 %.1f이고 혈액형은 %c입니다.\n\n", name, age, vision, bloodType);
		System.out.printf("제 이름은 %s이고 나이는 %s살입니다.\n시력은 %s이고 혈액형은 %s입니다.\n", name, age, vision, bloodType); // 형변환

		
		
	}
}
