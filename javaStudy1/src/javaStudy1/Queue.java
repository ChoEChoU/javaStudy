package javaStudy1;

import java.util.ArrayList;

public class Queue {
	ArrayList<Integer> queue = new ArrayList<Integer>(); //정수들의 집합을 위해서 ArrayList 클래스를 사용
	
	public void push(Integer X) {
		queue.add(X); // 사용자가 push 함수를 사용 할 경우 리스트에 정수 X를 추가
	}
	
	public Integer pop() {
		if (size() != 0) { // 리스트 안에 정수가 하나라도 있을 경우 *코드의 간결화를 위해 queue.size()가 아닌 같은 Class의 size() 함수 호출* 
			Integer firstNum = queue.get(0); // 변수를 리스트의 맨 앞 정수로 선언
			queue.remove(0); // 리스트의 맨 앞 정수 리스트 안에서 삭제
			return firstNum; // 선언했던 변수를 값으로 리턴
		}
		else {
			return -1; // 리스트 안에 정수가 하나도 없을 경우 -1을 리턴
		}
	}
	
	public Integer size() {
		return queue.size(); // 리스트의 정수 갯수를 리턴
	}
	
	public Integer empty() {
		 if (size() != 0) { // 리스트 안에 정수가 하나라도 있을 경우
			return 0; // 0을 리턴
		} else { // 리스트 안에 정수가 하나도 없을 경우
			return 1; // 1을 리턴
		}
	}
	
	public Integer front() {
		if (empty() == 1) { // 사실 size()로 해도 되는데 다른 방식으로 해보고 싶었음 empty 함수가 1을 리턴할 경우로 함
			return -1; // -1 리턴
		} else { // empty 함수가 0을 리턴할 경우
			return queue.get(0); // 리스트의 맨 앞 정수값을 리턴
		}
	}
	
	public Integer back() {
		if (empty() == 1) { // empty 함수가 1을 리턴할 경우
			return -1; // -1을 리턴
		} else { // empty 함수가 0을 리턴할 경우
			return queue.get(queue.size() -1); //리스트의 맨 끝 정수의 값을 리턴
		}
	}
 }