package javaStudy2;

import java.util.ArrayList;
import java.util.Random;

public class NumberBaseball {
	private ArrayList<Integer> numberSet = new ArrayList<Integer>();
	
//	public void makeNumber() {
//		Random random = new Random();
//		int num1 = random.nextInt(10);
//		
//		int num2 = random.nextInt(10);
//		
//		int num3 = random.nextInt(10);
//		
//		while (num2 == num1) {
//			num2 = random.nextInt(10);
//		}
//		
//		while (num3 == num2 || num3 == num1) {
//			num3 = random.nextInt(10);
//		}
//		
//		numberSet.add(num1);
//		numberSet.add(num2);
//		numberSet.add(num3);
//	}
	
	public ArrayList<Integer> playGame(int num1, int num2, int num3) {
		int strike = 0;
		int ball = 0;
//		String out = "out!";
		
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
		
		ArrayList<Integer> strikeBall = new ArrayList<Integer>();
		strikeBall.add(strike);
		strikeBall.add(ball);
		return strikeBall;
	}
	
	public int predictNumber(ArrayList<ArrayList<Integer>> numSet) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for (int i = 123; i < 1000; i++) {
			int firstI = i / 100;
			int secondI = i % 100 / 10;
			int thirdI = i % 100 % 10;
			
			if (firstI == secondI && secondI == thirdI && thirdI == firstI) {
				continue;
			}
			
			numberSet.add(firstI);
			numberSet.add(secondI);
			numberSet.add(thirdI);
			
			boolean flag = true;
			
			for (int j = 0; j < numSet.size(); j++) {
				int number = numSet.get(j).get(0);
				int strike = numSet.get(j).get(1);
				int ball = numSet.get(j).get(2);
				
				ArrayList<Integer> gameResult = playGame(number / 100, number % 100 / 10, number % 100 % 10);
				if (gameResult.get(0) == strike && gameResult.get(1) == ball) {
					continue;
				}
				else {
					flag = false;
				}	
			}
			if (flag == true) {
				result.add(i);
			}
			numberSet.clear();
		}
		
		return result.size();
	}
}
