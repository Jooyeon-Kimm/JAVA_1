package com.kita.first.practice;

import java.util.Scanner;

public class Practice5 {
	public static void main(String[] args) {
		
//		���� ���� ������ �Է����ּ���: (��/��)
//		������ �Է����ּ���:
//		
//		���� ���� : 60
//		���� ���� : 70
//		
//		"��� �̸��Դϴ�."
//		"����Դϴ�."
//		"��� �ʰ��Դϴ�."
		

		// 1
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� ���� ������ �Է����ּ���: ");
		String type = scan.next();
		
		System.out.print("������ �Է����ּ���: ");
		int score = scan.nextInt();
		

		
		if ("��".equals(type)) {
			if (score > 60) {
				System.out.println("��� �ʸ��Դϴ�..");
			} else if (score < 60) {
				System.out.println("��� �̸��Դϴ�.");
			} else {
				System.out.println("����Դϴ�.");
			}
		}
		
		else if ("��".equals(type)) {
			if (score > 70) {
				System.out.println("��� �ʸ��Դϴ�.");
			} else if (score < 70) {
				System.out.println("��� �̸��Դϴ�.");
			} else {
				System.out.println("����Դϴ�.");
			}
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
		
	}
		
		
		// 2

	
	
}
