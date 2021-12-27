package com.tech;

public class StringContainsVowels {

	public static void main(String[] args) {

		String string = "hello";

		StringBuffer sb = new StringBuffer();

		// if(string.toLowerCase().matches(".*[aeiou].*"));

		for (int i = 0; i < string.length(); i++) {

			char chr = string.charAt(i);
			if (chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u') {

				sb.append(chr);

			}
		}

		System.out.println(sb);
		System.out.print(sb.length());

	}

}
