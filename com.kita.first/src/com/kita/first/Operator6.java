package com.kita.first;

public class Operator6 {
	public static void main(String[] args) {
		// �� : == , !=, >=, <=, >, <
		// �� : !, &, |, &&, ||
		int n1 = 5;
		int n2 = 5;
		int n3 = 6;
		
		// & �ϳ��� ���� �ڱ��� ��� �����Ѵ�. ��ȿ����
		boolean result1 = (n1 >= n2 && n1 != n3 && n2 == n3);	// false
		boolean result2 = (n1 == n2 || n1 == n3 || n2 == n3);	// true

		
		System.out.println(!result1);	// true
		System.out.println(!!result2);	// true

		
		
	}
}
