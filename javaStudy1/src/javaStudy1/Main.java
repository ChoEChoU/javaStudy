package javaStudy1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in); // Scanner 객체 생성
		
		Integer lineNumber = input.nextInt(); // 정수를 입력 받음
		
		Queue queue = new Queue(); // Queue 객체 생성
//		Stack stack = new Stack();
		
		for (int i = 0; i < lineNumber; i++) { // lineNumber의 수만큼 반복
			String command = input.next(); // 명령을 입력받음
			switch (command) { // 입력받은 명령에 따라 실행을 다르게 함
			case "push": // 명령문이 push 일때
				Integer pushNumber = input.nextInt(); // push와 함께 입력받은 정수를 pushNumber란 변수에 선언
				queue.push(pushNumber); // pushNumber을 큐에 push함
//				stack.push(pushNumber);
				break; // switch문 종료

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
		input.close(); // 스캐너 닫기
	}
}
