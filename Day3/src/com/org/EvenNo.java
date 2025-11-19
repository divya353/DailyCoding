//Even number from 1 to 100 is

package com.org;

import java.util.Scanner;

public class EvenNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("Even Number from 1 to 100 is:");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Count of even number between 1 to 100 is: " + count);
	}

}
