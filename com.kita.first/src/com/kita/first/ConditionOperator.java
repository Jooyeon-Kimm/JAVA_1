package com.kita.first;

public class ConditionOperator {
	public static void main(String[] args) {
		
		// ���ǿ����� (���׿�����)		A ? B : C
		int n1 = 3;
		int n2 = 4;
		
		boolean isOdd = (n1 % 2 == 1) ? true : false;
		System.out.println(isOdd);	// true
		
		isOdd = (n2 % 2 == 1) ? true : false;
		System.out.println(isOdd);	// false
		
		
		String result = (n2 % 2 ==1) ? "Ȧ��" : "¦��";
		System.out.println(result);	// ¦��
		
		
	}
}
