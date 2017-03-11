package com.puralsight.stack;

public class LinkedListStack {
	LinkedList li = new LinkedList();

	public void push(int data) {
		li.insertFirst(data);
	}

	public void pop() {
		if (!li.isEmpty()) {
			li.deleteFirst();
		} else
			try {
				throw new IllegalArgumentException("The stack is empty");
			} catch (Exception e) {
				e.printStackTrace();
			}
	}

	public void displayStack() {
		System.out.println("  ");
		li.displayList();
	}

	public int getSize() {
		return li.getSize();
	}
	
	public void clear(){
		li.isEmpty();
	}

	public static void main(String args[]) {
		LinkedListStack stack = new LinkedListStack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.pop();
		stack.displayStack();
		stack.clear();
		stack.push(9);
		System.out.println("size is :"+stack.getSize());
	}
}