package com.kita.first;

public class Variable3 {
	public static void main(String[] args)
	{
		int n1 = 10;
		float n2 = 5.5f;
		
		float result1 = n1 + n2;
		int result2 = n1 + (int)n2; //�Ҽ��� �Ʒ� ���� ó��

		
		System.out.println(result1);	// 15.5
		System.out.println(result2);	// 15
		System.out.println((int)n2);	// 5

		
		int n3 = 3;
		int n4 = 4;
		String n5 = "5";
		
		// space �� ������ ���� �̼��ϰ� performance �ö�
		System.out.println(n3 + n4);		// 7
		System.out.println(n3 + (n4 + n5)); // 345, ���ڿ�ȭ

		System.out.println(3+4+"5");	// 75
		System.out.println(7+"5"); 		// 75
		
		
		
		System.out.println(1+2+"3");	// 33
		System.out.println(1+"2"+3);	// 123
		System.out.println("1"+2+3);	// 123
	}
}
