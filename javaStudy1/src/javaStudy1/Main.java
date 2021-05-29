package javaStudy1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		Integer lineNumber = input.nextInt();
		
		Queue queue = new Queue();
		
		for (int i = 0; i < lineNumber; i++) {
			String command = input.next();
			switch (command) {
			case "push":
				Integer pushNumber = input.nextInt();
				queue.push(pushNumber);
				break;

			case "pop":
				System.out.println(queue.pop());
				break;
				
			case "size":
				System.out.println(queue.size());
				break;
				
			case "empty":
				System.out.println(queue.empty());
				break;
				
			case "front":
				System.out.println(queue.front());
				break;
				
			case "back":
				System.out.println(queue.back());
				break;
			}
		}
		input.close();
//		queue.push(1);
//		queue.push(2);
//		System.out.println(queue.front());
//		System.out.println(queue.back());
//		System.out.println(queue.size());
//		System.out.println(queue.empty());
//		System.out.println(queue.pop());
//		System.out.println(queue.pop());
//		System.out.println(queue.pop());
//		System.out.println(queue.size());
//		System.out.println(queue.empty());
//		System.out.println(queue.pop());
//		queue.push(3);
//		System.out.println(queue.empty());
//		System.out.println(queue.front());
//		
//		System.out.print("\n");
//		
//		System.out.println("Stack Ãâ·Â°ª");
//		Stack stack = new Stack();
//		stack.push(1);
//		stack.push(2);
//		System.out.println(stack.top());
//		System.out.println(stack.size());
//		System.out.println(stack.empty());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.size());
//		System.out.println(stack.empty());
//		System.out.println(stack.pop());
//		stack.push(3);
//		System.out.println(stack.empty());
//		System.out.println(stack.top());
	}
}
