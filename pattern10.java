package com.sample.projecttest;

public class pattern10 {
	public static void startriangle(int k) {
		int i,j;
		for(i=0; i<k;i++) {
			for(j= 2*(k-i); j>=0;j--) {
				System.out.print(" ");
			}
			for(j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int K = 5;
		startriangle(K);

	}

}
