//Check the number is Positive,Negative or Zero
package com.org;

import java.util.Scanner;

public class PostitiveNegative {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int num=sc.nextInt();
		if(num==0) {
			System.out.println("Entered number is zero");
		}
		else if(num>0) {
			System.out.println("Entered number is Positive");
		}
		else {
			System.out.println("Entered number is Negative");

		}
	}

}
