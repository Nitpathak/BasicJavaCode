package myCode;

import java.util.Scanner;

public class PalindromesString {

	public static void main(String[] args) {
		
		
		/*
		 * Logic step by step-
		 * 1. Find the length of the String.
		 * 2. With the help of For Loop iterate from end to start. Suppose length of string is 4 then we iterate 4 times.
		 * 3. Every time when we iterate we extract extract from string.
		 * 4. Add extract extract in other variable.(example: rev variable).
		 * 
		 * Methods used for this:- 1. length() function 2. charAt() function
		 * 
		 */

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any string");

		String str = sc.next();

		String rev = "";

		String org_string = str;

		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);
		}

		if (org_string.equals(rev))

		{
			System.out.println(org_string + " This is Palindromes String");
		}

		else

		{
			System.out.println(org_string + " This is Not Palindromes String");

		}

	}

}
