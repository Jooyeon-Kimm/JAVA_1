package com.kita.first.practice;

public class Variable1 {

	public static void main(String[] args) {
		
		//java�� ������ ���
		//���� ( �Ϲ� ����, ���� ���� )
		//�Ϲ� ����, ���� ���� ( char, byte, short, int, long, float, double, boolean )
		//������ �Ϲ� ���� ( char, byte, short, int, long )
		//�⺻�� 4Byte (32 bit) int / ����Ʈ����� 64��Ʈ���� ������ ���� 32��Ʈ
		
		char v1;	//���� ����
		v1 = 'A';	//������ �ʱ�ȭ, �ʱⰪ
					//character, ���� ����ǥ, �����ڵ� ���� �ϳ�
		

		byte v2 = (byte)128;	//���� ����ȯ
		//System.out.print(v2);	// -128 ~ 127
		short v3;
		int v4;
		long v5;
		
		//�Ǽ��� �Ϲ� ����
		//�⺻�� 8Byte (64 bit) double : �� ��Ȯ 
		float v6= 10.1f;
		double v7 = 10.1;
		
		//�� (��, ����)
		boolean v8;		//�Ҹ��� Ÿ���� ����� �޸𸮿� �Ҵ�
		v8 = true;
		v8 = false;
		
		
		
		
		
		
		
		
		int num1 = 5;
		System.out.println(num1);
		
		num1 = 8;
		System.out.println(num1);

		
		int n1, n2, n3;
		
		
		
		//��� , Upper Snake Case ǥ���
		final int NUM_6 = 6;
		System.out.println(NUM_6);
		
		// NUM_6 = 7; Err : The final local variable NUM_6 cannot be assigned.
		
		
		
		//���� ����
		String v9 = "Buen Trabajo";	//�ּҰ�
		System.out.println(v9);
		System.out.print("Juan");	//literal value ��� ����

		
		Variable1 v;	//���� ����
	}
	//�Ϲݺ��� �ҹ��ڷ� ����, �������� �빮�ڷ� ����
}





// ( char < byte < short < int < long < float < double < String / boolean )
