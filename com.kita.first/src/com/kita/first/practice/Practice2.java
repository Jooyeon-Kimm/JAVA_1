package com.kita.first.practice;

public class Practice2 {
	public static void main(String[] args) {
		
		/*
		 * name
		 * age
		 * vision
		 * bloodType
		 * 
		 * �� �̸��� OOO�̰� ���̴� OO���Դϴ�.
		 * �÷��� O.O�̰� �������� O�Դϴ�.
		 */
		
		String name = "Joo";
		int age = 64;
		float vision = 1.2f;	// double vision = 1.5;
		char bloodType = 'A';	// String bloodType = "AB";
		
		
		// print, println
		System.out.print("�� �̸��� " +name+ "�̰� ���̴� " +age+ "���Դϴ�.\n");	// int�� ���ڿ�ȭ �ȴ�.
		System.out.println("�÷��� " +vision+ "�̰� �������� " +bloodType+ "�Դϴ�.\n");
		
		
		// printf
		System.out.printf("�� �̸��� %s�̰� ���̴� %d���Դϴ�.\n�÷��� %.1f�̰� �������� %c�Դϴ�.\n\n", name, age, vision, bloodType);
		System.out.printf("�� �̸��� %s�̰� ���̴� %s���Դϴ�.\n�÷��� %s�̰� �������� %s�Դϴ�.\n", name, age, vision, bloodType); // ����ȯ

		
		
	}
}
