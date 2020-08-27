package myCode;

import java.util.Scanner;

public class EvenOddDigitsInNumber {

	public static void main(String[] args) {

		System.out.println("Code Execution is stareted now---");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Eneter Your Number--");

		int num = sc.nextInt();

		int even_num = 0;
		int odd_num = 0;

		while (num != 0) {
			int rem = num % 10;
			if (rem % 2 == 0) {
				even_num = even_num + 1;

			}

			else {
				odd_num = odd_num + 1;
			}

			num = num / 10;

		}

		System.out.println("The Count of Even Number is" + " " + even_num);
		System.out.println("The Count of Odd Number is" + " " + odd_num);

		System.out.println("Code Execution is completed now");

	}

}
