package com.paytm.sahin.util;

public class Node {
	public int num;
	public Node next;

	public Node(int num) {
		this.num = num;
	}

	public static Node reverseLinkedList(Node actualList) {
		if (actualList.next == null) {
			return actualList;
		} else {
			Node nextReversed, tempList;
			nextReversed = tempList = reverseLinkedList(actualList.next);
			while (tempList.next != null) {
				tempList = tempList.next;
			}
			tempList.next = actualList;
			actualList.next = null;
			return nextReversed;
		}
	}

	public static Node createListFromDigitsOfNumber(String num) {
		Node digitsList = new Node();
		Node destroyableList = digitsList;
		for (int i = 0; i < num.length(); i++) {
			destroyableList.num = Integer.valueOf(num.charAt(i) + "");
			if (i == num.length() - 1) {
				break;
			}
			destroyableList.next = new Node();
			destroyableList = destroyableList.next;
		}
		return digitsList;
	}

	public void printList() {
		Node list = this;
		while (list.next != null) {
			System.out.print(list.num + "->");
			list = list.next;
		}
		System.out.println(list.num);
	}

	public Node() {
		super();
		// TODO Auto-generated constructor stub
	}
}
