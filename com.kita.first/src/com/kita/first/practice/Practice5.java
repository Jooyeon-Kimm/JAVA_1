package com.kita.first.practice;

import java.util.Scanner;

import com.kita.first.Scan;

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
		
		
		/*
		// 1
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� ���� ������ �Է����ּ���: ");
		String type = scan.next();
		
		System.out.print("������ �Է����ּ���: ");
		int score = scan.nextInt();
		

		
		if ("��".equals(type)) {
			if (score > 60) {
				System.out.println("��� �ʰ��Դϴ�.");
			} else if (score < 60) {
				System.out.println("��� �̸��Դϴ�.");
			} else {
				System.out.println("����Դϴ�.");
			}
		}
		
		else if ("��".equals(type)) {
			if (score > 70) {
				System.out.println("��� �ʰ��Դϴ�.");
			} else if (score < 70) {
				System.out.println("��� �̸��Դϴ�.");
			} else {
				System.out.println("����Դϴ�.");
			}
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
		
		
		
		// 2
		scan = new Scanner(System.in);
		System.out.print("���� ���� ������ �Է����ּ���: ");
		type = scan.next();
		System.out.print("������ �Է����ּ���: ");
		score = scan.nextInt();
		
		if("��".contentEquals(type)) {
			if(score > 60) {
				System.out.println("��� �ʰ��Դϴ�.");
			} else if (score <60) {
				System.out.println("��� �̸��Դϴ�.");
			} else {
				System.out.println("����Դϴ�.");
			}
		} else if("��".contentEquals(type)) {
			if(score > 70) {
				System.out.println("��� �ʰ��Դϴ�.");
			} else if (score <70) {
				System.out.println("��� �̸��Դϴ�.");
			} else {
				System.out.println("����Դϴ�.");
			}
		}
		
		
		*/
		
		// 3
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ���� ������ �Է����ּ���: ");
		String type = scan.next();

		
		int average = 70;
		if("��".contentEquals(type) || "��".contentEquals(type)) {
			System.out.print("������ �Է����ּ���: ");
			int score = scan.nextInt();
			if("��".contentEquals(type)) {
				average = 60;
			}
			
			if (score > average) {
				System.out.println("��� �ʰ��Դϴ�.");			
			} else if (score < average)  {
				System.out.println("��� �̸��Դϴ�.");
			} else {
				System.out.println("����Դϴ�.");
			}
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
		scan.close();
	}
		
	
		
		

	
	
}
