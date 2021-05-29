package javaStudy1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		Integer lineNumber = input.nextInt();
		
		Queue queue = new Queue();
		//Stack stack = new Stack();
		
		for (int i = 0; i < lineNumber; i++) {
			String command = input.next();
			switch (command) {
			case "push":
				Integer pushNumber = input.nextInt();
				queue.push(pushNumber);
				//stack.push(pushNumber);
				break;

			case "pop":
				System.out.println(queue.pop());
//				System.out.println(stack.pop());
				break;
				
			case "size":
				System.out.println(queue.size());
//				System.out.println(stack.size());
				break;
				
			case "empty":
				System.out.println(queue.empty());
//				System.out.println(stack.empty());
				break;
				
			case "front":
				System.out.println(queue.front());
				break;
				
			case "back":
				System.out.println(queue.back());
				break;
				
//			case "top":
//				System.out.println(stack.top());
//				break;
			}
		}
		input.close();
	}
}
