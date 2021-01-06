package com.kita.first.practice;

public class Practice15 {
	public static void main(String[] args) {
		
//		****
//		****
//		****
//		****
		int i, k;
		int star = 4;
		for(i = 0; i< star; i++) {
			for (k = 0; k<star; k++) {
				System.out.print("*");
			} System.out.println();
		} System.out.println();
		
		
		
		
//		****
//		****
//		****
//		****
		for(i =1; i<=star*star;i++) {
			System.out.print("*");
			if(i%star==0) {
				System.out.println();
			}
		}System.out.println();
		
		
		
//		*
//		**
//		***
//		****
		for(i=1; i<=star;i++) {
			for(k=0; k<i; k++) {
				System.out.print("*");
			} System.out.println();
		}
		

		
		
	
		
		
		
		
		
		
		
		
	}
}
