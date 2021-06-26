package javaStudy3;

public class Factorial {
	
	public int calculation(int number) {
		int result = number;
		if (number != 0) {
			result *= calculation(number-1);
			return result;
		}
		else {
			return result+1;
		}
	}
}