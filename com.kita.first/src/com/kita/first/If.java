package com.kita.first;

import com.sun.tools.sjavac.server.SysInfo;

public class If {
	public static void main(String[] args) {
		
		
		int n1 = 3;
		int n2 = 6;
		boolean isOdd = (n1 % 2 == 1) ? true : false;
		
		
//		if(���ǽ�) {
//			���� �ڵ�
//		}
		
		

//		1
		if(n1 % 2 == 1) {
			System.out.printf("%d�� Ȧ���Դϴ�.\n", n1);
		} else {
			System.out.printf("%d�� ¦���Դϴ�.\n", n1);
		}
		
		
		
//		2
		String oddNum;
		
		if(n1 % 2 == 1) {
			oddNum = "Ȧ��";
		} else {
			oddNum = "¦��";
		}
		System.out.printf("%d�� %s�Դϴ�.\n", n1, oddNum);
		
		
		
		
//		3	
		oddNum = "¦��";
		
		if(n1 % 2 == 1) {
			oddNum = "Ȧ��";
		}
		System.out.printf("%d�� %s�Դϴ�.\n", n1, oddNum);

		
		
		
//		if ~ else if ~ else ��
		
/*		if() {
 *			
 *		} else if() {
 *		
 *		} else {
 *		
 *		}
 */

		
		// ȿ���� -> Ȯ���� ���� �� ���� �������� ���	(������ ����)
		if (n1 > n2) {
			System.out.println("n1�� n2���� ũ��.");
		} else if (n1 < n2) {
			System.out.println("n1�� n2���� �۴�.");
		} else {
			System.out.println("n1�� n2�� ����.");
		}
		
		
		
		
		
		
		
	}
}
