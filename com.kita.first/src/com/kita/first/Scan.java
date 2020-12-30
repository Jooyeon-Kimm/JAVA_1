package com.kita.first;

import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {
		
//		System.in.read();
		Scanner scan = new Scanner(System.in);		// Rarely used
		
		
		int num = scan.nextInt();					// . = ~의
		System.out.println(num);
		
		String str = scan.next();
		System.out.println(str);
		
		
		scan.close(); 	// scan 아래 있던 노란 줄 사라짐, 메모리 누수

	}
}
