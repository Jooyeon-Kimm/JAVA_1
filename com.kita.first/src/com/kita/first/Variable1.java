package com.kita.first.practice;

public class Variable1 {

	public static void main(String[] args) {
		
		//java는 보수적 언어
		//변수 ( 일반 변수, 참조 변수 )
		//일반 변수, 원시 변수 ( char, byte, short, int, long, float, double, boolean )
		//정수형 일반 변수 ( char, byte, short, int, long )
		//기본형 4Byte (32 bit) int / 소프트웨어는 64비트지만 가정용 컴은 32비트
		
		char v1;	//변수 선언
		v1 = 'A';	//변수를 초기화, 초기값
					//character, 작은 따옴표, 유니코드 문자 하나
		

		byte v2 = (byte)128;	//강제 형변환
		//System.out.print(v2);	// -128 ~ 127
		short v3;
		int v4;
		long v5;
		
		//실수형 일반 변수
		//기본형 8Byte (64 bit) double : 더 정확 
		float v6= 10.1f;
		double v7 = 10.1;
		
		//논리 (참, 거짓)
		boolean v8;		//불리언 타입의 사이즈를 메모리에 할당
		v8 = true;
		v8 = false;
		
		
		
		
		
		
		
		
		int num1 = 5;
		System.out.println(num1);
		
		num1 = 8;
		System.out.println(num1);

		
		int n1, n2, n3;
		
		
		
		//상수 , Upper Snake Case 표기법
		final int NUM_6 = 6;
		System.out.println(NUM_6);
		
		// NUM_6 = 7; Err : The final local variable NUM_6 cannot be assigned.
		
		
		
		//참조 변수
		String v9 = "Buen Trabajo";	//주소값
		System.out.println(v9);
		System.out.print("Juan");	//literal value 사용 지양

		
		Variable1 v;	//참조 변수
	}
	//일반변수 소문자로 시작, 참조변수 대문자로 시작
}





// ( char < byte < short < int < long < float < double < String / boolean )
