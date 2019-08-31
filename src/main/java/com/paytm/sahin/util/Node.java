package com.paytm.sahin.util;

public class Node {

	public int num;
	public Node next;

	public Node() {
	}

	public Node(int num) {
		this.num = num;
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

	public String printList() {
		StringBuilder listPrinter = new StringBuilder();
		Node list = this;
		if(list != null) {
			while (list.next != null) {
				listPrinter.append(list.num + "->");
				list = list.next;
			}
			listPrinter.append(list.num);
		}
		return listPrinter.toString();
	}

	public static Node reverseLinkedList(Node actualList) {
		if (actualList == null || actualList.next == null) {
			return actualList;
		} else {
			Node nextReversed;
			nextReversed = reverseLinkedList(actualList.next);
			actualList.next.next = actualList;
			actualList.next = null;
			return nextReversed;
		}
	}

}
