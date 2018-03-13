package com.dinesh.elumalai.java.alg.stack;

public class CustomStackUsingLinkedList {

	private Node head;

	public CustomStackUsingLinkedList() {
		this.head = null;
	}

	@Override
	public String toString() {
		return "CustomStackUsingLinkedList [head=" + head + "]";
	}

	static class Node {
		int data;
		Node next;

		@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + "]";
		}

	}

	public void push(int value) {
		Node oldHead = head;
		head = new Node();
		head.data = value;
		head.next = oldHead;
	}

	public int pop() {
		if (head == null) {
			System.out.println("Stack is Empty");
			return -1;
		}
		int value = head.data;
		head = head.next;
		return value;
	}

	public static void main(String[] args) {
		CustomStackUsingLinkedList stack = new CustomStackUsingLinkedList();
		stack.pop();

		for (int i = 0; i < 15; i++) {
			stack.push((int) (Math.random() * 100));
		}

		System.out.println(stack);
		for (int i = 0; i < 3; i++) {
			System.out.println("Item Poped : " + stack.pop());
		}
		System.out.println(stack);
	}

}
