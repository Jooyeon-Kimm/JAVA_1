package com.kita.first.practice;

import java.util.Scanner;

public class Practice8 {
	public static void main(String[] args) {
		
		/*
		 * 1 ~ 12 ��
		 * 3 ~ 5��  : ��
		 * 6 ~ 8��  : ����
		 * 9 ~ 11��: ����
		 * 12 ~ 2��: �ܿ�
		 * 
		 * n���� oo�Դϴ�.
		 */
		
		
		/* 1
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		String season = "�ܿ�";
		
		
		switch(month) {
		case 3: case 4: case 5:
			season = "��";
			break;
		case 6: case 7: case 8:
			season = "����";
			break;
		case 9: case 10: case 11:
			season = "����";
			break;
		default:
			season = "�ܿ�";
		} System.out.printf("%d����  %s�Դϴ�.", month, season);
		*/
		
		
		
		
		/* 2
		Scanner scan = new Scanner(System.in);
		String month = scan.next();
		int monthNum = Integer.parseInt(month);		// String �� int�� ��ȯ����
		String season = "�ܿ�";
		
		if ( 3<= monthNum && monthNum <= 5) {		// 2 < monthNum && monthNum < 6
			season = "��";
		} else if (6 <= monthNum && monthNum <= 8) {
			season = "����";
		} else if (9 <= monthNum && monthNum <= 11) {
			season = "����";
		} System.out.printf("%d����  %s�Դϴ�.", monthNum, season);

		
		scan.close();
		*/
		
		
		
		//3
		Scanner scan = new Scanner(System.in);
		String month = scan.next();
		int monthNum = Integer.parseInt(month);		// String �� int�� ��ȯ����
		
		if ( 3<= monthNum && monthNum <= 5) {
			System.out.printf("%d����  ���Դϴ�.", monthNum);
		} else if (6 <= monthNum && monthNum <= 8) {
			System.out.printf("%d����  �����Դϴ�.", monthNum);
		} else if (9 <= monthNum && monthNum <= 11) {
			System.out.printf("%d����  �����Դϴ�.", monthNum);
		} else if (monthNum == 12 || monthNum == 1 || monthNum == 2) {
			System.out.printf("%d����  �ܿ��Դϴ�.", monthNum);
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}

		
		scan.close();
	}
}
