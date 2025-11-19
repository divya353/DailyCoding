//Odd Number from 1 to 100
package com.org;

import java.util.Scanner;

public class OddNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("Odd number from 1 to 100 is:");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
				count++;
			}

		}
		System.out.println("Count of odd number between 1 to 100 is: " + count);
	}

}
