package myCode;

import java.util.Scanner;

public class PalindromesNumbers {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);

		System.out.println("Eneter Any Number");

		int num = SC.nextInt();

		int original_num = num;

		// Logic to check Palindrome Numbers

		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		if (original_num == rev) {
			System.out.println(original_num + " This is Palindrome Number");
		}

		else {
			System.out.println(original_num + " This is Not Palindrome Number");

		}

	}

}
