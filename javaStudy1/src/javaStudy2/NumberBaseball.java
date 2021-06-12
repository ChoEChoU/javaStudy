package javaStudy2;

import java.util.ArrayList;
import java.util.Random;

public class NumberBaseball {
	private ArrayList<Integer> numberSet;
	
	public void makeNumber() {
		Random random = new Random();
		int num1 = random.nextInt(10);
		
		int num2 = random.nextInt(10);
		
		int num3 = random.nextInt(10);
		
		while (num2 == num1) {
			num2 = random.nextInt(10);
		}
		
		while (num3 == num2 || num3 == num1) {
			num3 = random.nextInt(10);
		}
		
		numberSet.add(num1);
		numberSet.add(num2);
		numberSet.add(num3);
	}
}
