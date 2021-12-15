package com.tech;

public class StarPatterns {

	public void firstPattern() {
		int row = 5;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		StarPatterns sp = new StarPatterns();
		sp.firstPattern();

	}
}
