package javaStudy1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		Integer number = input.nextInt();
		
		for (int i = 0; i < number; i++) {
			String command = input.nextLine();
			
		}
		System.out.println("Queue 출력값");
		Queue queue = new Queue();
		queue.push(1);
		queue.push(2);
		System.out.println(queue.front());
		System.out.println(queue.back());
		System.out.println(queue.size());
		System.out.println(queue.empty());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.size());
		System.out.println(queue.empty());
		System.out.println(queue.pop());
		queue.push(3);
		System.out.println(queue.empty());
		System.out.println(queue.front());
		
		System.out.print("\n");
		
		System.out.println("Stack 출력값");
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		System.out.println(stack.top());
		System.out.println(stack.size());
		System.out.println(stack.empty());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.empty());
		System.out.println(stack.pop());
		stack.push(3);
		System.out.println(stack.empty());
		System.out.println(stack.top());
	}
}
