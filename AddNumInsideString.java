package com.hari;

public class AddNumInsideString {

public static void main(String[] args) {
		
		String str = "har3sh4nka2";
		char ch;
		int n, sum = 0;
		for(int i = 0; i<str.length();i++) {
			
			ch = str.charAt(i);
			
			if(Character.isDigit(ch)) {
				
				n = Character.getNumericValue(ch);
				
				sum += n;
			}
		}
		System.out.println("Sum of the Number inside String"+sum);
		
	}
}
