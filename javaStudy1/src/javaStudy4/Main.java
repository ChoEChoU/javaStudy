package javaStudy4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		BinarySearchTree tree = new BinarySearchTree();
		
		for (int i = 0; i < 9; i++) {
			Node node = new Node(scan.nextInt());
			tree.insert(node);	
		}
		
		tree.postOrder(tree.getRoot());
		
//		================================================
		
		TowerOfHanoi hanoi = new TowerOfHanoi();
		
		int number = scan.nextInt();
		
		int count = (int) Math.pow(2, number)-1;
		
		System.out.println(count);
		
		hanoi.move(number, 1, 3, 2);
		
		scan.close();
	}

}
