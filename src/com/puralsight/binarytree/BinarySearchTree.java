package com.puralsight.binarytree;

public class BinarySearchTree {
	private Node head;
	private int size = 0;

	public class Node {
		private Node left;
		private Node right;
		private int value;

		public Node(int value) {
			this.value = value;
		}

		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
	}

	public void addNode(int value) {
		Node newNode = new Node(value);
		size++;
		if (head == null) {
			head = newNode;
		} else {
			addTo(head, newNode);
		}
	}

	public void addTo(Node current, Node newNode) {
		if (newNode.getValue() < current.getValue()) {
			if (current.left == null) {
				current.left = newNode;
			} else
				addTo(current.left, newNode);
		} else {
			if (current.right == null) {
				current.right = newNode;
			} else
				addTo(current.right, newNode);
		}
	}

	public String find(Node current, int value) {
		if (current == null)
			return null;
		if (current.value == value)
			return "" + value;
		if (current.value > value)
			return find(current.left, value);
		else
			return find(current.right, value);
	}

	public void printInOrder(Node current) {
		if (current == null)
			return;
		printInOrder(current.left);
		System.out.println(current.value);
		printInOrder(current.right);
	}

	public void printPreOrder(Node current) {
		if (current == null)
			return;
		System.out.println(current.value);
		printPreOrder(current.left);
		printPreOrder(current.right);
	}

	public void printPostOrder(Node current) {
		if (current == null)
			return;
		System.out.println(current.value);
		printPostOrder(current.left);
		printPostOrder(current.right);
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.addNode(4);
		bst.addNode(2);
		bst.addNode(1);
		bst.addNode(3);
		bst.addNode(6);
		bst.addNode(5);
		bst.addNode(7);
		System.out.println(bst.find(bst.head, 88));
		// System.out.println(bst.size);
		// bst.printInOrder(bst.head);
		// bst.printPreOrder(bst.head);
	}
}
