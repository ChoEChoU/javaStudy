package javaStudy1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in); // Scanner ��ü ����
		
		Integer lineNumber = input.nextInt(); // ������ �Է� ����
		
		Queue queue = new Queue(); // Queue ��ü ����
//		Stack stack = new Stack();
		
		for (int i = 0; i < lineNumber; i++) { // lineNumber�� ����ŭ �ݺ�
			String command = input.next(); // ����� �Է¹���
			switch (command) { // �Է¹��� ��ɿ� ���� ������ �ٸ��� ��
			case "push": // ��ɹ��� push �϶�
				Integer pushNumber = input.nextInt(); // push�� �Բ� �Է¹��� ������ pushNumber�� ������ ����
				queue.push(pushNumber); // pushNumber�� ť�� push��
//				stack.push(pushNumber);
				break; // switch�� ����

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
		input.close(); // ��ĳ�� �ݱ�
	}
}
