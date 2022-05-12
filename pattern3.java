package com.sample.projecttest;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  n=5;
		for(int i=1; i<n;i++) {
			for (n=2*(n-i); n>=0; n--)         
			{       
			System.out.print(" ");   
			}  
			
			System.out.println();
		}

	}

}
