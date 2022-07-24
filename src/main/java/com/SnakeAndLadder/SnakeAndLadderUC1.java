package com.SnakeAndLadder;

import java.util.Random;

public class SnakeAndLadderUC1 {
	
	public static void main(String[] args) {
		
		int position =0;
		System.out.println("Position : " + position);
		
		Random r = new Random();
		int randomInt = r.nextInt(6) + 1;
		System.out.println("Number: " + randomInt);
	}
}
