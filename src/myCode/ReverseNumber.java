package myCode;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); // This Scanner function is used to take input from user

		System.out.println("Enter a Number");

		int num = sc.nextInt(); // nextInt() - nextInt() method Scans the next token of the input as an integer

		// Logic 01 - Reverse Number using Algorithm method

		int rev = 0;

		while (num != 0) { // num value = 1234 //123 //12 //1 //0 (now value is 0 so exist from loop.

			rev = rev * 10 + num % 10; // phase01 - 0*10 + 1234/10 = 4 //phase02- 4*10+123/10= 43 // 43*10+12/10=432
										// //432*10 + 1/10= 4321
			num = num / 10; // 1234/10= 123 //123/10=12 //12/10 //1/10

		}

		System.out.println("The Reverse Number is.." + rev); // rev value = 4321

	}

}
