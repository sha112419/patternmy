package com.sample.projecttest;

public class pattern11 {

	public static void main(String[] args) {
		int pattern = 5;
		int space = 0;
		int charactercount = 5;
		String astericCharacter = "*";
		for(int i = 0; i < pattern; i++) {
			for(int j=5; j>i; j--) {
				System.out.print(astericCharacter);
			}
			
			
			System.out.println();
			space +=1;
			
			
		}
		
       
	}

}
