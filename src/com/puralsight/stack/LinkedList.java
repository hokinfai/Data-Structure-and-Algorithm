package com.puralsight.stack;

public class LinkedList {

	private Node head;
	private int size;
	
	public class Node {

		public int data;
		public Node next;
		public void printSize(){
			System.out.println(size);
		}

		public Node(int data) {
			this.data = data;
		}

		public void displayNode() {
			System.out.print(data);
			System.out.print("  ");

		}
	}

	public void insertFirst(int data) {
		Node n = new Node(data);
		n.next = head;
		head = n;
		size++;
	}

	public Node deleteFirst() {
		Node tem = head;
		head = head.next;
		size--;
		return tem;
	}

	public void displayList() {
		Node current = head;
		while (current != null) {
			current.displayNode();
			current = current.next;
		}
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		size = 0;
		return (head == null);
	}
}
