package com.kita.first.practice;

public class Practice7 {
	public static void main(String[] args) {
		
		// 1 ~ 6 �� 6���� �޴� ���� �̱�
		int rNum = (int) (Math.random() * 6 + 1);
		String menu;
		
		if (rNum == 1) { 
			menu= "ġŲ";
		}
		
		else if (rNum == 2 || rNum == 4) {
			menu = "�ܹ���";
		}
		
		else if (rNum == 3) {
			menu = "����";
		}
		
		else if (rNum == 5) {
			menu = "������";
		}
		
		else {
			menu = "������";
		}
		
		System.out.printf("%s �԰� �ʹ�....", menu);
		
	}
}
