package javaStudy1;

import java.util.ArrayList;

public class Queue {
	ArrayList<Integer> queue = new ArrayList<Integer>();
	
	public void push(Integer X) {
		queue.add(X);
	}
	
	public Integer pop() {
		if (queue.size() != 0) {
			Integer firstNum = queue.get(0);
			queue.remove(0);
			return firstNum;
		}
		else {
			return -1;
		}
	}
	
	public Integer size() {
		return queue.size();  
	}
	
	public Integer empty() {
		 if (queue.size() != 0) {
			return 0;
		} else {
			return 1;
		}
	}
	
	public Integer front() {
		if (empty() == 1) {
			return -1;
		} else {
			return queue.get(0);
		}
	}
	
	public Integer back() {
		if (empty() == 1) {
			return -1;
		} else {
			return queue.get(queue.size() -1);
		}
	}
 }