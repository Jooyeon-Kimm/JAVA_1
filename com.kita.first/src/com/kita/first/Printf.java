package com.kita.first;

public class Printf {
	public static void main(String[] args) {
// 		System.out.println();
// 		System.out.print();
//		System.out.printf(format, args);
		
		
		int age = 10;
		String name = "�趯��";
		
		
		// �趯���� 10���̴�.
		System.out.println("�趯���� 10���̴�.");
		System.out.println(name + "�� "+ age+ "���̴�.");
		System.out.printf("%s�� %d���̴�.\n\n", name, age);
		
		
		/*
		 ���ط� 20���� �� �趯����
		 �˹ٸ� �����Ͽ� �Ŵ� 123������ �ް� �Ǿ���.
		 �趯���� ������ 50%�� 615000���� ����
		 A ���������� �� ������ 2.33%¥�� ���ݿ� �ֱ�� ����ߴ�.
		 */
		
		age = 20;
		int salary = 1_230_000;
		int rate = 50;
		double interest_rate = 2.3333333333;
		char bank = 'A';	// String bank = "A";
		

		System.out.printf("���ط� %d���� �� %s��\n�˹ٸ� �����Ͽ� �Ŵ� %d������ �ް� �Ǿ���.\n", age, name, salary / 10000);
		System.out.printf("%s�� ������ %d%%�� %.0f���� ����\n%c ���������� �� ������ %.2f%%¥�� ���ݿ� �ֱ�� ����ߴ�.\n" , 
					name, rate, salary * 0.5, bank, interest_rate);
		

	}
}
