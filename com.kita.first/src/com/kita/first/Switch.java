package com.kita.first;

public class Switch {
	public static void main(String[] args) {
		
		// 1 ~ 6 �� 6���� �޴� ���� �̱�
		// �ٸ��߱� : Shift + Tab, Tab
		
		int rNum = (int) (Math.random() * 6 + 1);
		String menu;
		
		switch(rNum) {
		case 1:
			menu = "�ѽ�"; 
			break;
		case 2: case 4:
			menu = "���";
			break;
		case 3:
			menu = "�Ͻ�";
			break;
		default:
			menu = "ġŲ";
		}
		
		System.out.printf("������ �޴��� %s�Դϴ�.", menu);
		
	}
}
