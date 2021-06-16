package javaStudy2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		int[] array = null;
		
		for (int i = 0; i < num-1; i++) {
			int number = scan.nextInt();
			array[i] = number; 
		}
		
		BubbleSort sort = new BubbleSort();
		sort.sort(array);
		
		NumberBaseball baseball = new NumberBaseball();
		
		baseball.makeNumber();
		
		System.out.println(baseball.playGame(3, 4, 6));
	}

}
