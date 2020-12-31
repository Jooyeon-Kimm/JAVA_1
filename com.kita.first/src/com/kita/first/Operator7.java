package com.kita.first;

public class Operator7 {
	public static void main(String[] args) {
		
		int n1 = 3;
		int n2 = 5;
		boolean result1 = (n1 > n2);
		System.out.println(result1);		// false
		
		
		String str1 = "�ȳ�1";
		String str2 = "�ȳ�2";
		boolean result2 = (str1 == str2);	// false
		System.out.println(result2);
		
		// The operator > is undefined for the argument type(s) 
		// java.lang.String, java.lang.String
		
		
		boolean result3 = "�ȳ�1".equals(str2);	// ������ equals �ڿ� �θ� �� ������
		System.out.println(result3);			// false
		
		
		
		str1 = "hi";
		str2 = "hi";
		String str3 = new String("hi");
		
		System.out.println(str1 == str2); 	// true
		System.out.println(str2 == str3);	// false
		
		System.out.println(str1.equals(str3));			// ���� Ÿ�Գ����� �� ����		// true
		System.out.println(str1.contentEquals(str3)); 	// �ٸ� Ÿ�Գ����� �� ����		// true
	}
}
