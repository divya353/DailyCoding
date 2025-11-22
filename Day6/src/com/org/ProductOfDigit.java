//Product of digit
package com.org;

import java.util.Scanner;

public class ProductOfDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		int num = sc.nextInt();
		int product = 1;
		while (num > 0) {
			int rem = num % 10;
			product = product * rem;
			num = num / 10;
		}
		System.out.println("Product of entered number is: " + product);
	}

}
