package com.kita.first;

public class Printf {
	public static void main(String[] args) {
// 		System.out.println();
// 		System.out.print();
//		System.out.printf(format, args);
		
		
		int age = 10;
		String name = "김땡떙";
		
		
		// 김땡땡은 10살이다.
		System.out.println("김땡떙은 10살이다.");
		System.out.println(name + "은 "+ age+ "살이다.");
		System.out.printf("%s은 %d살이다.\n\n", name, age);
		
		
		/*
		 올해로 20살이 된 김땡땡은
		 알바를 시작하여 매달 123만원을 받게 되었다.
		 김땡떙은 월급의 50%인 615000원을 떼어
		 A 저축은행의 연 이자율 2.33%짜리 적금에 넣기로 결심했다.
		 */
		
		age = 20;
		int salary = 1_230_000;
		int rate = 50;
		double interest_rate = 2.3333333333;
		char bank = 'A';	// String bank = "A";
		

		System.out.printf("올해로 %d살이 된 %s은\n알바를 시작하여 매달 %d만원을 받게 되었다.\n", age, name, salary / 10000);
		System.out.printf("%s은 월급의 %d%%인 %.0f원을 떼어\n%c 저축은행의 연 이자율 %.2f%%짜리 적금에 넣기로 결심했다.\n" , 
					name, rate, salary * 0.5, bank, interest_rate);
		

	}
}
