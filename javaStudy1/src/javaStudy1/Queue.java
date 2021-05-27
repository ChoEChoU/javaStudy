package javaStudy1;

import java.util.ArrayList;

public class Queue {
	ArrayList<Integer> queue = new ArrayList<Integer>(); //�������� ������ ���ؼ� ArrayList Ŭ������ ���
	
	public void push(Integer X) {
		queue.add(X); // ����ڰ� push �Լ��� ��� �� ��� ����Ʈ�� ���� X�� �߰�
	}
	
	public Integer pop() {
		if (size() != 0) { // ����Ʈ �ȿ� ������ �ϳ��� ���� ��� *�ڵ��� ����ȭ�� ���� queue.size()�� �ƴ� ���� Class�� size() �Լ� ȣ��* 
			Integer firstNum = queue.get(0); // ������ ����Ʈ�� �� �� ������ ����
			queue.remove(0); // ����Ʈ�� �� �� ���� ����Ʈ �ȿ��� ����
			return firstNum; // �����ߴ� ������ ������ ����
		}
		else {
			return -1; // ����Ʈ �ȿ� ������ �ϳ��� ���� ��� -1�� ����
		}
	}
	
	public Integer size() {
		return queue.size(); // ����Ʈ�� ���� ������ ����
	}
	
	public Integer empty() {
		 if (size() != 0) { // ����Ʈ �ȿ� ������ �ϳ��� ���� ���
			return 0; // 0�� ����
		} else { // ����Ʈ �ȿ� ������ �ϳ��� ���� ���
			return 1; // 1�� ����
		}
	}
	
	public Integer front() {
		if (empty() == 1) { // ��� size()�� �ص� �Ǵµ� �ٸ� ������� �غ��� �;��� empty �Լ��� 1�� ������ ���� ��
			return -1; // -1 ����
		} else { // empty �Լ��� 0�� ������ ���
			return queue.get(0); // ����Ʈ�� �� �� �������� ����
		}
	}
	
	public Integer back() {
		if (empty() == 1) { // empty �Լ��� 1�� ������ ���
			return -1; // -1�� ����
		} else { // empty �Լ��� 0�� ������ ���
			return queue.get(queue.size() -1); //����Ʈ�� �� �� ������ ���� ����
		}
	}
 }