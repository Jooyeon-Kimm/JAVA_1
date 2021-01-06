package com.kita.first;

public class NamedLoop {
	public static void main(String[] args) {
		
		Parent:
		for(int i=0; i<5; i++) {
			Child:
			for(int k=0; k<3; k++) {
				if(k==1) {
					// break;
					continue Parent;
					// break Parent;
				}
				System.out.printf("%d %d\n", i, k);
			}
		}
		
/* break; ¶Ç´Â continue Parent; */		
//		0 0
//		1 0
//		2 0
//		3 0
//		4 0

		
/* break Parent; */
//	   	0 0

		
		
	}
}
