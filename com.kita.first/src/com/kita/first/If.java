package com.kita.first;

public class If {
	public static void main(String[] args) {
		
		
		int n1 = 3;
		int n2 = 6;
		boolean isOdd = (n1 % 2 == 1) ? true : false;
		
		
//		if(���ǽ�) {
//			���� �ڵ�
//		}
		
		

		if(n1 % 2 == 1) {
			System.out.printf("%d�� Ȧ���Դϴ�.\n", n1);
		} else {
			System.out.printf("%d�� ¦���Դϴ�.\n", n1);
		}
		
		
		

		String oddNum;
		if(n1 % 2 == 1) {
			oddNum = "Ȧ��";
		} else {
			oddNum = "¦��";
		}
		System.out.printf("%d�� %s�Դϴ�.\n", n1, oddNum);

		
	}
}
