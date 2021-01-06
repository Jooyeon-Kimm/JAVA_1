package com.kita.first.practice;

public class Practice17 {
	public static void main(String[] args) {
		
		int i, k;
		int star = 4;
		
//		(1)
//		*
//		**
//		***
//		****
		for(i=1; i<=star;i++) {
			for(k=0; k<i; k++) {
				System.out.print("*");
			} System.out.println();
		}
		
		
		
//		(2)	
//		*
//		**
//		***
//		****
		int line = 1;
		int st = 0;
		for(i = 1; i<= star*star; i++) {	// 총 찍을 수 있는 칸 : star * star
			System.out.print("*");
			st++;

			if(st == line) {				// 별 개수 = 라인 수이면 개행, 라인+1, 별 0개로 초기화
				System.out.println();
				line++;
				st = 0;
			}
			if (star < line) {				// star행보다 line 커지면 반복문 탈출
				break;
			}
		}

		
		
		
//		(3)		
//		*
//		**
//		***
//		****
//		등차수열: 별 총 개수 = star *(star+1) / 2
		
		for(i=1, k=1; i<= star*(star+1)/2; i++) {
			System.out.print("*");
			
			if(i == k*(k+1)/2) {
				System.out.println();
				k++;
			}
		}

		
		
//	    (4)		
//		*
//		**
//		***
//		****
		for(i=1; i<=star;i++) {
			for(k=star; k>0; k--) {
				if (i<k) {
					System.out.print("");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		
		
		
//	    (4-1)		
//		*
//		**
//		***
//		****
		for(i=1; i<=star;i++) {
			for(k=star; k>0; k--) {
				System.out.print(i<k ? "": "*");
			}
			System.out.println();
		}
		
		
		
//	    (5)		
//		****
//		 ***
//		  **
//		   *
		int star = 4;
		int i, k;
		for(i=0; i<=star; i++) {
			for(k=1; k<=i;k++) {
				System.out.print(" ");
			}
			for(k=1; k<=star-i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
