package com.package1;

import java.util.Scanner;

public class DemoWithScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum= a+b;
		
		System.out.println("Sum is: "+sum);
		System.out.println("Adding few more lines");

	}

}
