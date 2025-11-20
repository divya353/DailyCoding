package com.org;

import java.util.Scanner;

public class PalidromeNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		int duplicateno = num;
		int rev = 0;
		while (num > 0) {

			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if (duplicateno == rev) {
			System.out.println("Entered number is Palidrome");
		} else {
			System.out.println("Entered number is  not Palidrome");

		}
	}

}
