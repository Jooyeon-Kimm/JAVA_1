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
		}
		
		System.out.printf("%d����  %s�Դϴ�.", month, season);
		
		scan.close();
		
	}
}
