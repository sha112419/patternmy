package com.sample.projecttest;

public class Pattern13 {
	public static void main(String[] args) {
		int pattern = 5;
		int space = 0;
		int charactercount =3;
		 for(int i=0; i< pattern; i++) {
			 for(int j=5; j>charactercount ; j--) {
				 System.out.print("*");
			 }
			 System.out.println();
			 space +=0;
			 charactercount -=1;
		}
	}

}
