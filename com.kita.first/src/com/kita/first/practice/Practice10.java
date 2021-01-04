package com.kita.first.practice;

import java.util.Scanner;

public class Practice10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է����ּ��� (0~100): ");
		
		int score = scan.nextInt();
		scan.close();
		
		if(score > 100 || score < 0) {
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
			return;
		}
		
		String opt = "";
		int mod = score % 10;	// 1�� �ڸ��� ���
		
		if (mod >= 7) {
			opt = "+";
		} else if (mod <= 3) {
			opt = "-";
		}
		
		
		switch(score/10) { 		// 10�� �ڸ� �� ���
		case 10:
			System.out.print("A+");
			break;	// ���� ����� �ϳ��� ���ǹ��̳� �ݺ������� ������
		case 9:
			System.out.print("A" + opt);
			break;
		case 8:
			System.out.print("B" + opt);
			break;
		case 7:
			System.out.print("C" + opt);
			break;
		default:
			System.out.print("D");
		
		}
	}
}
