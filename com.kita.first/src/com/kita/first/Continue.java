package com.kita.first;

public class Continue {
	public static void main(String[] args) {
		
		for(int i=0; i<2; i++) {
			for(int z = 0; z <3; z++) {
				for(int r =0; r <3; r++) {
					if (r == 1) {
						continue; 		// for(int r =0; r <3; r++)
					}
					System.out.printf("%d %d %d\n", i, z, r);
				}
			} 
		}
		
//		0 0 0
//		0 0 2
//		0 1 0
//		0 1 2
//		0 2 0
//		0 2 2
//		1 0 0
//		1 0 2
//		1 1 0
//		1 1 2
//		1 2 0
//		1 2 2
		
		
		System.out.println("\n");
		
		for(int i=0; i<2; i++) {
			for(int z = 0; z <3; z++) {
				for(int r =0; r <3; r++) {
					if (r == 1) {
						break; 		// for(int r =0; r <3; r++)
					}
					System.out.printf("%d %d %d\n", i, z, r);
				}
			}
		}
		
		
//		0 0 0
//		0 1 0
//		0 2 0
//		1 0 0
//		1 1 0
//		1 2 0
		
		
//		return VS break
//		return�� �޼ҵ� ���� (main �޼ҵ�)
//		break �� ���� ����� �ݺ���/���ǹ� ����
	
	}
}
