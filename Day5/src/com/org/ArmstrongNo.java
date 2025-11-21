
package com.org;

import java.util.Scanner;

public class ArmstrongNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		int num = sc.nextInt();
		int inputNum = num;
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			sum = sum + (rem * rem * rem);
			num = num / 10;
		}
		if (inputNum == sum) {
			System.out.println("Enered number is Armstrong ");

		} else {
			System.out.println("Enterd number is  not Armstrong");
		}
	}

}
