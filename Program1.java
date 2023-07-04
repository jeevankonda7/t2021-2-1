package org.prepare;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first value:");
		double a = sc.nextDouble();
		System.out.println("enter the second value:");
		double b = sc.nextDouble();
		sc.nextLine();
		System.out.println("the the operation you want to perform");
		String op = sc.nextLine();

		switch (op) {
		case "+": {
			System.out.println("the result is: " + (a + b));
			break;
		}
		case "-": {
			System.out.println("the result is: " + (a - b));
			break;
		}
		case "*": {
			System.out.println("the result is: " + (a * b));
			break;
		}
		case "/": {
			System.out.println("the result is: " + (a / b));
			break;
		}
		case "%": {
			System.out.println("the result is: " + (a % b));
			break;
		}
		}
		sc.close();

	}

}
