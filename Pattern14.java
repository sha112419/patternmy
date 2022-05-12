package com.sample.projecttest;

public class Pattern14 {

	public static void main(String[] args) {
		int patternLength = 5;
		int numOfItems = 5;
		
		for(int i = 0; i < patternLength; i++) {
			for(int j=1; j <= numOfItems; j++) {
				System.out.print((j * 2));
			}			
			System.out.println();
			numOfItems -= 1;
		}

	}
}