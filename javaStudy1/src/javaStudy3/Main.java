package javaStudy3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Factorial factorial = new Factorial();
		
		int inputNumber = scan.nextInt();
		
		System.out.println(factorial.calculation(inputNumber));
		
// ===========================================
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int[] numSet = new int[n];
		
		for (int i = 0; i < n; i++) {
			int number = scan.nextInt();
			numSet[i] = number;
		}
		
		BlackJack blackjack = new BlackJack();
		System.out.println(blackjack.playGame(numSet, m));
		
		scan.close();
	}

}
