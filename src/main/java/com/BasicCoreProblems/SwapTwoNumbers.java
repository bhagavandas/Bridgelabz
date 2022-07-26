package com.BasicCoreProblems;

import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the values of X and Y : ");
		int x =obj.nextInt();
		int y =obj.nextInt();
		 System.out.println("before swapping numbers: "+x +"  "+ y);
		int t=x;
		x=y;
		y=t;
		
		  System.out.println("After swapping: "+x +"   " + y);  
	}

}
