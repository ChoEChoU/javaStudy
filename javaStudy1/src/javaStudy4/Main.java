package javaStudy4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node1 = new Node(50);
		Node node2 = new Node(30);
		Node node3 = new Node(24);
		Node node4 = new Node(5);
		Node node5 = new Node(28);
		Node node6 = new Node(45);
		Node node7 = new Node(98);
		Node node8 = new Node(52);
		Node node9 = new Node(60);
		
		BinarySearchTree tree = new BinarySearchTree();
		
		tree.insert(node1);
		tree.insert(node2);
		tree.insert(node3);
		tree.insert(node4);
		tree.insert(node5);
		tree.insert(node6);
		tree.insert(node7);
		tree.insert(node8);
		tree.insert(node9);
		
		tree.postOrder(node1);
		
	}

}
