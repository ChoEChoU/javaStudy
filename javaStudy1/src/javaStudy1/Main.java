package javaStudy1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	}
}
