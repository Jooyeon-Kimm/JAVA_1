package com.kita.first.practice;

import java.util.Scanner;

public class Practice19 {
	public static void main(String[] args) {
		
//		�� ���� �����
//		���ڸ� �Է��ϼ��� (0 �Է� �� ����): 1
//		���ڸ� �Է��ϼ��� (0 �Է� �� ����): 3
//		���ڸ� �Է��ϼ��� (0 �Է� �� ����): 7
//		���ڸ� �Է��ϼ��� (0 �Է� �� ����): 2
//		���ڸ� �Է��ϼ��� (0 �Է� �� ����): 0
//		�հ�: 13
		

		int total = 0;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("���ڸ� �Է��ϼ��� (0 �Է� �� ����): ");
			int num = scan.nextInt();

			if (num == 0) {
				break;
			}
			total += num;
		}
		scan.close();
		System.out.printf("�հ�: %d", total);
		
		
	
		
		
		
	}
}
