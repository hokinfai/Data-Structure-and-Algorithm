package com.puralsight.linkedlist;

public class LinkedList {
	private Node head;
	private Node tail;
	private int size;

	public LinkedList() {
		head = null;
		size = 0;
		tail = null;
	}

	public class Node {
		public int value;
		public Node next;

		public Node(int value) {
			this.value = value;
			this.next = null;

		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

	public int getSize() {
		return size;
	}

	public void printListedList(LinkedList list) {
		Node node = list.head;
		while (node != null) {
			System.out.println(node.value);
			node = node.next;

		}
	}

	public void addFirst(int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
		if (head.next == null)
			tail = head;
		size++;
	}

	public void addLast(int value) {
		Node newNode = new Node(value);
		if (size == 0) {
			addFirst(value);
		} else {
			tail.next = newNode;
			tail = newNode;
			size++;
		}
	}

	public Node node(int index) {
		if (index > size)
			return null;
		else {
			Node x = head;
			for (int i = 0; i < index; i++) {
				x = x.next;
			}
			return x;
		}
	}

	public int indexOf(int index) {
		return node(index).value;
	}

	public void add(int index, int value) {
		if (index == 0) {
			addFirst(value);
		} else {
			Node newNode = new Node(value);
			Node tem = node(index - 1);
			Node tem2 = tem.next;
			System.out.println("Here is " + tem.value);
			tem.next = newNode;
			newNode.next = tem2;
			size++;
		}
	}

	public void remove(int index) {
		if (index == 0) {
			head = node(index).next;
		} else
			node(index - 1).next = node(index).next;
	}

	public static void main(String args[]) {
		LinkedList number = new LinkedList();
		LinkedList.Node nodes = number.new Node(500);
		System.out.println(nodes.getValue());
		number.addFirst(10);
		number.addFirst(20);
		number.addFirst(30);
		number.addLast(5);
		number.addLast(10);
		number.addLast(15);
		number.add(1, 25);
		number.printListedList(number);
		System.out.println();
		System.out.println(number.getSize());
		number.remove(6);
		System.out.println();

		// System.out.println(number.node(4).value);
		number.printListedList(number);

	}

}
