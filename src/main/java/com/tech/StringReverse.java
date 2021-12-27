package com.tech;

public class StringReverse {
	
	public static void main(String[] args) {
		
		String string = "MANISH LANDE";
		
		for(int i=string.length()-1; i>=0 ;i--) {
			
			System.out.print(string.charAt(i));
		}
		
	}

}
