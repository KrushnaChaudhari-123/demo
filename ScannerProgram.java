package com.pom.demo.SeleniumAutomation;

import java.util.Scanner;

public class ScannerProgram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		String b = sc.nextLine();
		int a = sc.nextInt();
		sc.close();
		System.out.println(a);
		System.out.println(b);
	}
}
