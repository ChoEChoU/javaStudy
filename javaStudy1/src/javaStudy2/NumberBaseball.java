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
	
	public ArrayList<Integer> playGame(int num1, int num2, int num3) {
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
			
		}
		
		ArrayList<Integer> strikeBall = new ArrayList<Integer>();
		strikeBall.add(strike);
		strikeBall.add(ball);
		return strikeBall;
	}
	
	public int predictNumber(ArrayList<ArrayList<Integer>> numSet) {
		ArrayList<String> result = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					if (i != j && j != k && k != i) {
						String StrI = String.valueOf(i);
						String StrJ = String.valueOf(j);
						String StrK = String.valueOf(k);
						
						String StrIJK = StrI + StrJ + StrK;
						
						int IntIJK = Integer.parseInt(StrIJK);
						
						for (int l = 0; l < numSet.size(); l++) {
							Integer Input = numSet.get(l).get(0);
							String strInput = String.valueOf(Input);
							
							int inputFirst = Integer.parseInt(StrI);
							int inputSecond = Integer.parseInt(StrJ);
							int inputThird = Integer.parseInt(StrK);
							
							ArrayList<Integer> game = playGame(inputFirst, inputSecond, inputThird);
							
							int strike = game.get(0);
							int ball = game.get(1);
							
							if (strike == numSet.get(l).get(1) && ball == numSet.get(l).get(2)) {
								result.add(StrIJK);
							} 
						}
					}
				}
			}
		}
		return result.size();
	}
}
