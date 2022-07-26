package com.BasicCoreProblems;

import java.util.Scanner;

public class CheckingEvenorOdd {
	public static void main(String[] args) {
		Scanner obj =new Scanner(System.in);
		System.out.println("Enter a number: ");
		int value=obj.nextInt();
		if(value%2 == 0) 
			System.out.println("Number is even");
		else
			System.out.println("Number is odd");
	}

}
