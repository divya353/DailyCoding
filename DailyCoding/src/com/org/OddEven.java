package com.org;

import java.util.Scanner;

public class OddEven {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int n1=sc.nextInt();
		if(n1%2==0) {
			System.out.println("The number is even " +n1);
		}
		else {
			System.out.println("The number is odd " +n1);

		}
		
	}

}
