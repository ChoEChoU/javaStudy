package javaStudy1;

import java.util.ArrayList;

public class Stack {
	private ArrayList<Integer> stack = new ArrayList<Integer>();
	
	public void push(Integer X) {
		stack.add(X);
	}
	
	public Integer pop() {
		if (size() != 0) {
			Integer topNum = stack.get(size()-1);
			stack.remove(size()-1);
			return topNum;
		} else {
			return -1;
		}
	}
	
	public Integer size() {
		return stack.size();
	}
	
	public Integer empty() {
		if (size() != 0) {
			return 0;
		} else {
			return 1;
		}
	}
	
	public Integer top() {
		if (empty() == 0) {
			return stack.get(size()-1);
		} else {
			return -1;
		}
	}
}
