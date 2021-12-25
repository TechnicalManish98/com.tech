package com.tech;

public class FibonacciSeries {

	public static void main(String[] args) {

		// 1 1 2 3 5 8 13

		long a = 0;
		long b = 1;
		System.out.print(b + " ");
		for (int i = 2; i <= 25; i++) {

			long c = a + b;
			System.out.print(c+" ");
			a = b;
			b = c;

		}

	}

}
