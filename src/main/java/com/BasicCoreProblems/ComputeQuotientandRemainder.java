package com.BasicCoreProblems;

import java.util.Scanner;

public class ComputeQuotientandRemainder {
	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		int num1 = obj.nextInt();

		int num2 = obj.nextInt();

		int quotient = 0, remainder = 0;
		quotient = num1 / num2;
		remainder = num1 % num2;
		System.out.println("Quotient is: "+ quotient);
		System.out.println("Remainder is: " + remainder);

	}
}
