package com.org;

import java.util.Scanner;

public class LargestNo {

	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first Number:");
		int a=sc.nextInt();
		System.out.println("Enter Second Number:");
		int b=sc.nextInt();
		if(a>b) {
			System.out.println("The largest number is:" +a);
		}
		else{
			System.out.println("The largest number is:" +b);

		}
	}
}
