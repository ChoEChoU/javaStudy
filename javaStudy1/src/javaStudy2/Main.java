package javaStudy2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		int[] array = new int[num];
		
		for (int i = 0; i < num; i++) {
			int number = scan.nextInt();
			array[i] = number; 
		}
		
		BubbleSort sort = new BubbleSort();
		sort.sort(array);
		
		System.out.println(sort.getSwapCnt());

		
		NumberBaseball baseball = new NumberBaseball();
		
		ArrayList<ArrayList<Integer>> numSet = new ArrayList<ArrayList<Integer>>();
		
		int N = scan.nextInt();
		
		for (int i = 0; i < N; i++) {
			int num1 = scan.nextInt();
			
			int strike = scan.nextInt();
			
			int ball = scan.nextInt();
			
			ArrayList<Integer> inputNum = new ArrayList<Integer>();
			
			inputNum.add(num1);
			inputNum.add(strike);
			inputNum.add(ball);
			
			numSet.add(inputNum);
		}
		
		System.out.println(baseball.predictNumber(numSet));
		
		scan.close();
		
	}

}
