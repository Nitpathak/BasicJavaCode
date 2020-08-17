package myCode;

public class ReverseString {

	public static void main(String[] args) {

		/*
		 * Logic step by step-
		 * 
		 * 1. Find the length of the string. 2. With the help if for loop iterate from
		 * end. Suppose length of string is 4 then we iterate 4 time. 3. Every time when
		 * we iterate then we extract character from the string 4. Add that character in
		 * some other variable.(ex- rev variable).
		 * 
		 * Methods used for this- 1. length() function 2. charAt() function
		 * 
		 */

		// Login 01 - Using + (String concatenation) operator

		String str = "YUVRAJ";

		String rev = "";

		int len = str.length(); // Length = 6

		for (int i = len - 1; i >= 0; i--) {  //5 //4 //3 //2 //1 //0 //-1 Condition false exit from the loop and print rev value
			
			rev = rev + str.charAt(i); // index is start from 0 so - JARVUY
		}

		System.out.println("The Reverse String is.." + rev);

	}

}
