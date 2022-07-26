package com.SnakeAndLadder;

import java.util.ArrayList;

import java.util.List;

import java.util.Random;

public class SnakeAndLadderUC3 {
	static int position=6;
	static int option = 0;

	public static void main(String[] args) {

		String[] options = { "NoPlay", "Ladder", "Snake" };
		Random r = new Random();
		int random_option = r.nextInt(options.length);
		System.out.println(options[random_option]);
		positionmethod();
		NoPlay();

	}

	public static void positionmethod() {

		Random r = new Random();
		int randomInt = r.nextInt(6) + 1;
		System.out.println("Number: " + randomInt);
	}

	public static void NoPlay() {
		for (option=0;option<position;option++) {
			System.out.println(option);
		}

	}
}
