package com.tech;

public class SwapNumbers {

	public static void main(String[] args) {

		int a = 78;
		int b = 54;

		a = a + b;
		b = a - (a - b); // 20
		a = a - b;

		System.out.println(a + " - " + b);
	}

}
