package myCode;

import java.util.Scanner;

public class SumOfDigitsInNumber {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("*********Code Execution is started Now************");

		System.out.println("Enter your number");

		int num = sc.nextInt();

		int sum = 0;

		while (num != 0) {
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;

		}

		System.out.println("Count Sum Of Digits in a Number" + " " + sum);

		System.out.println("*********Code Execution is Ended Now************");

	}

}
