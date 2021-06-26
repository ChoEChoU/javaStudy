package javaStudy3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Factorial factorial = new Factorial();
//		System.out.println(factorial.calculation(4));
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int[] numSet = new int[n];
		
		for (int i = 0; i < n; i++) {
			int number = scan.nextInt();
			numSet[i] = number;
		}
	}

}
