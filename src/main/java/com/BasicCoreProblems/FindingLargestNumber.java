package com.BasicCoreProblems;

public class FindingLargestNumber {
	public static void main(String[] args) {
		int a=12; int b=8; int c=65;
		if(c>=a && c>=b)
			System.out.println(c + " is the largest number");
		else
			if(a>=b && a<=c)
				System.out.println(a + " is the largest number");
	}

}
