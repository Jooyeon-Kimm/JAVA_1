package com.kita.first;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String sNum = scan.next();
		String menu;		
		switch(sNum) {
		case "��":
			menu = "�ѽ�"; 
			break;
		case "��": case "��":
			menu = "���";
			break;
		case "��":
			menu = "�Ͻ�";
			break;
		default:
			menu = "ġŲ";
		}
		
		scan.close();
		System.out.printf("������ �޴��� %s�Դϴ�.", menu);

	}
}
