package com.kita.first;

public class Operator4 {
	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 3;
		
		double result1 =  (double)n1 /n2;	// n2 �ڵ����� �Ǽ�ȭ��
		float result2 = (float)n1 / n2;		// n2 �ڵ����� �Ǽ�ȭ��
		double result3 = (double)(n1 / n2);	// ������ �Ǽ�ȭ
		
		int result4 = n1 / n2;				// n1�� n2�� ���� >>��<<
		int result5 = n1 % n2;				// n1�� n2�� ���� >>������<<	// Ȧ¦ ����, ���
		
		
		System.out.println(result1);		// 3.3333333333333335
		System.out.println(result2);		// 3.3333333
		System.out.println(result3+ "\n");	// 3.0
		
		System.out.println(result4);		// 3
		System.out.println(result5);		// 1
		
		
	}

}
