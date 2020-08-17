package myCode;

public class SwipingOfTwoNumber {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println("Before swiping the value are.." + a + " " + b);

		// Logic 01 - swapping with the help of 3rd variable

		int x = a;
		a = b;
		b = x;

		// Logic 02 - swapping with the help of + and - operator

		a = a + b; // 10+20 = 30
		b = a - b; // 30-20 = 10
		a = a - b; // 30-10 = 20

		// Logic 03 - swapping with the help of * and / operator - values should not be
		// 0

		a = a * b; // 10*20 = 200
		b = a / b; // 200/20 = 10
		a = a / b; // 200/10 = 20

		// Logic 04 - Using XOR operator

		a = a ^ b; // 10^20 = 30
		b = a ^ b; // 30^20 = 20
		a = a ^ b; // 30^20 = 10

		// Logic 05 - in single line

		b = a + b - (a = b);

		System.out.println("After swiping the value are.." + a + " " + b);

	}

}
