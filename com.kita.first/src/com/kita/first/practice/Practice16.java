package com.kita.first.practice;

import java.util.Scanner;

public class Practice16 {
	public static void main(String[] args) {
		
//		1 ~ 6 �� 6���� �޴� ���� �̱� �� �� �� �Ŀ�
//		���� �޴�: oo
//		������ ���  Y ������ �ݺ� ������
//		"������ �޴��� oo�Դϴ�."
//		������ �� ��� N ������ �ٽ� ���� �̱�
		
		Scanner scan = new Scanner(System.in);
		String menu;
		boolean again = true;
		
		// �޴� �̱�
		do {
			int rNum = (int) (Math.random() * 6 + 1);
			if (rNum == 1) { 
				menu= "ġŲ";
			}else if (rNum == 2 || rNum == 4) {
				menu = "�ܹ���";
			}else if (rNum == 3) {
				menu = "����";
			}else if (rNum == 5) {
				menu = "������";
			}else {
				menu = "������";
			}
			System.out.println("���� �޴�: " + menu);
			System.out.print("������ ��ϱ�?(Y/N) ");
			String result = scan.next();
			System.out.println();
			
			
			if("Y".contentEquals(result) || "N".contentEquals(result)) {
				if("Y".contentEquals(result)) {
					System.out.printf("������ �޴��� %s�Դϴ�.", menu);
					break;
				} else if( "N".contentEquals(result)) {
					continue;
				}
			} else {
				System.out.println("[�߸��Է��ϼ̽��ϴ�] �޴��� �ٽ� �̽��ϴ�.\n");
				// break;
			}
		} while(again);		// ������ ��� �� �ȵ�� ��
		
		scan.close();
		
		/*
		switch(result) {
		case "Y":
			break;
		default: 
			System.out.println("�޴��� �ٽ� �̽��ϴ�.");
			*/
	}
}

