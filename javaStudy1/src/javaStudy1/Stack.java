package javaStudy1;

import java.util.ArrayList;

public class Stack {
	ArrayList<Integer> stack = new ArrayList<Integer>();
	
	public void push(Integer X) {
		stack.add(X);
	}
	
	public Integer pop() {
		if (stack.size() != 0) {
			Integer topNum = stack.get(stack.size());
			stack.remove(stack.size());
			return topNum;
		} else {
			return -1;
		}
	}
	
	public Integer size() {
		return 0;
	}
	
	public Integer empty() {
		return 0;
	}
	
	public Integer top() {
		return 0;
	}
}
