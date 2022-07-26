package com.BasicCoreProblems;

import java.util.Scanner;

public class HarmonicNumber {
	public static void main(String[] args) {
		Scanner N = new Scanner(System.in);
		
		System.out.println("Harmonic Value: ");
		int value = N.nextInt();
		//int N = 8;

		
		System.out.print(nthHarmonic(value));
	}

	static double nthHarmonic(int value) {

		float harmonic = 1;

		// loop to apply the formula
		// Hn = H1 + H2 + H3 ... + Hn-1 + Hn-1 + 1/n
		for (int i = 2; i <= value; i++) {
			harmonic += (float) 1 / i;
		}

		return harmonic;
		
	}

}
