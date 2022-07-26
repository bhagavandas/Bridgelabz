package com.BasicCoreProblems;

import java.util.Random;

public class FlipCoinPercentage {
	public static void main(String[] args) {

		int head = 0;
		int tail = 0;
		for (int i = 1; i <= 10; i++) {
			double flip = Math.random();
			String coin = "";
			if (flip < 0.5)
				head++;
			else
				tail++;
		}
		System.out.println("Percentage of Head:" + (head) / 10.0 * 100);
		System.out.println("Percentage of Head:" + (tail) / 10.0 * 100);
	}
}
