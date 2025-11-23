package com.org;

import java.util.Scanner;

public class FibbonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number to print series ");
		int num=sc.nextInt();
		int a=0;
		int b=1;
		for(int i=1;i<=num;i++) {
			System.out.println(a);
			int sum=a+b;
			a=b;
			b=sum;
		}
		
	}

}
