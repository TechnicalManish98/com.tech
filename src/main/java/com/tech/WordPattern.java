package com.tech;

public class WordPattern {

	public void patternWord() {

		int alphabet = 65;

		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {

				System.out.print((char) (alphabet + j) + "");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		System.out.println("Word Pattern is below :");
		
		WordPattern wp = new WordPattern();
		wp.patternWord();
	}

}
