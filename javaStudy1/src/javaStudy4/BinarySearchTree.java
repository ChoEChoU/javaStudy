package javaStudy4;

public class BinarySearchTree {
	private Node root;
	
	public void setRoot(Node node) {
		this.root = node;
	}
	
	public void insert(Node node) {
		if (root == null) {
			setRoot(node);
		}
		else {
			insertNode(root, node);
		}
	}
	
	public void insertNode(Node parent, Node node) {
		 if (parent.getKey() < node.getKey()) {
			if (parent.getRight() == null) {
				parent.setRight(node);
			}
			else {
				insertNode(parent.getRight(), node);
			}
		}
		else {
			if (parent.getLeft() == null) {
				parent.setLeft(node);
			}
			else {
				insertNode(parent.getLeft(), node);
			}
		}
	}
	
	public Node search(int key) {
		return check(root, key); 
	}
	
	public Node check(Node node, int key) {
		if (node == null) {
			return null;
		}
		if (node.getKey() == key) {
			return node;
		}
		else if (node.getKey() > key) {
			return check(node.getLeft(), key);
		}
		else {
			return check(node.getRight(), key);
		}
	}
	
	public void preOrder(Node node) {
		if (node != null) {
			System.out.println(node.getKey());
			preOrder(node.getLeft());
			preOrder(node.getRight());
		}
	}
	
	public void postOrder(Node node) {
		if (node != null) {
			postOrder(node.getLeft());
//			System.out.println(node.getKey());
			postOrder(node.getRight());
			System.out.println(node.getKey());
		}
	} 
}
