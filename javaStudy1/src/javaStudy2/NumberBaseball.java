package javaStudy2;

import java.util.ArrayList;
import java.util.Random;

public class NumberBaseball {
	private ArrayList<Integer> numberSet = new ArrayList<Integer>();
	
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
	
	public String playGame(int num1, int num2, int num3) {
		int strike = 0;
		int ball = 0;
		String out = "out!";
		
		if (numberSet.contains(num1) && numberSet.get(0) == num1) {
			strike++;
		}
		else if (numberSet.contains(num1) && numberSet.get(0) != num1) {
			ball++;
		}
		
		if (numberSet.contains(num2) && numberSet.get(1) == num2) {
			strike++;
		}
		else if (numberSet.contains(num2) && numberSet.get(1) != num2) {
			ball++;
		}
		
		if (numberSet.contains(num3) && numberSet.get(2) == num3) {
			strike++;
		}
		else if (numberSet.contains(num3) && numberSet.get(2) != num3) {
			ball++;
		}
		
		if (!numberSet.contains(num1) && !numberSet.contains(num2) && !numberSet.contains(num3)) {
			return out;
		}
		
		return String.valueOf(strike) + "strike " + String.valueOf(ball) + "ball";
	}
	
	public int predictNumber(ArrayList<ArrayList<Integer>> numSet) {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			numList.add(i);
		}
		
		for (int i = 0; i < numSet.size(); i++) {
			int number = numSet.get(i).get(0);
			
			String strNumber = String.valueOf(number);
			
			int strike = numSet.get(i).get(1);
			int ball = numSet.get(i).get(2);
			
			if (strike == 0 && ball == 0) {
				numList.remove(strNumber.indexOf(0));
				numList.remove(strNumber.indexOf(1));
				numList.remove(strNumber.indexOf(2));
			}
			
			if (strike + ball == 3) {
				numList.remove(strNumber.indexOf(0));
			}
		}
		return 0;
	}
}
