package myCode;

public class DigitsInNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num = 1456789999;
		int count = 0;
		
		while (num!=0)
		{
			num = num/10;
			count = count+1;
		}
		
		System.out.println(count);

	}

}
