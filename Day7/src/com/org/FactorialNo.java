//Factorial of given number
package com.org;

import java.util.Scanner;

public class FactorialNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		int fact = 1;
		while (num >= 1) {
			fact = fact * num;
			num--;
		}
		System.out.println("Factorial of enterd number is: " + fact);
	}

}
