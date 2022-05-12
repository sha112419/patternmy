package com.sample.projecttest;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int patternLength = 5;
		int spaceLength = patternLength - 1;
		int characterCount = 1;
		String astericCharacter = "*";
         for(int i = 0; i < patternLength; i++) {
        	 for(int j = 0; j < spaceLength; j++) {
        		 System.out.print(" ");
        	 }
        	 for(int k = 0; k < characterCount; k++) {
        		 System.out.print(astericCharacter);
        	 }
        	 System.out.println();
        	 spaceLength -= 1;
        	 characterCount += 1;
         }
	}
	
}
