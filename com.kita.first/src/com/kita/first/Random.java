package com.kita.first;

public class Random {
	public static void main (String[] args) {
		
		double num1 = Math.random();		// 0 ~ 1 ������ ���� �ϳ� �߻���Ŵ	// 0 <= num < 1
		System.out.println(num1);			// 0���� 0.999999...
		
		
		int num2 = (int)Math.random();		// 0 <= num < 1
		System.out.println(num2); 			// 0 �ۿ� ����
		
		
		int num3 = (int)(Math.random() * 10);		// 0 <= num3 * 10 < 10 		// 0, 1, 2, ... 8, 9
		System.out.println(num3);
		
		int num4 = (int)(Math.random() * 10 + 1 );	// 1 <= num4 < 11
		System.out.println(num4);

	}
}
