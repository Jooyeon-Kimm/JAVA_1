package com.kita.first.practice;

import java.util.Scanner;	// java.util �ȿ� �ִ� Scanner Class�� �����Դ�!

public class Practice4 {
	public static void main(String[] args) {
		
//		java.util.Scanner scan = new java.util.Scanner(System.in);
		
//		��ĳ�ʷ� ������ �ϳ� �Է¹ް�
//		�� ���� Ȧ���̸� "Ȧ���Դϴ�."
//		�� ���� ¦���̸� "¦���Դϴ�."
		
		
		Scanner scan = new Scanner(System.in);	// ����� : �����س��� �Ⱦ� ��, ������ ����� �޸� ���� ����
		int num = scan.nextInt();				// Error: input mismatch -> try/catch
		
		
		String is = "¦��";
		if(num % 2 == 1) { is = "Ȧ��"; }
		System.out.printf("%d : %s�Դϴ�.", num, is);

		
		scan.close();	//scan�� close �޼ҵ�� �ݾ��ش�!
	}
}
