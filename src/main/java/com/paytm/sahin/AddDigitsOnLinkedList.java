package com.paytm.sahin;

import com.paytm.sahin.util.Node;

public class AddDigitsOnLinkedList {

	public static void main(String[] args) {
		Node n1 = Node.createListFromDigitsOfNumber("9878");
		Node n2 = Node.createListFromDigitsOfNumber("5876");
		addTwoLinkedListNumbers(n1, n2).printList();
	}

	public static Node addTwoLinkedListNumbers(Node firstNumber, Node secondNumber) {
		Node firstNumberReversed = Node.reverseLinkedList(firstNumber);
		Node secondNumberReversed = Node.reverseLinkedList(secondNumber);
		Node resultList, tempList;
		tempList = resultList = new Node();

		int carry = 0;
		int sumOfOnePlaceValue = 0;
		while (firstNumberReversed != null || secondNumberReversed != null) {
			if (tempList != null) {
				if (firstNumberReversed != null && secondNumberReversed != null) {
					sumOfOnePlaceValue = firstNumberReversed.num + secondNumberReversed.num + carry;
					if (sumOfOnePlaceValue >= 10) {
						carry = 1;
					}
					tempList.num = sumOfOnePlaceValue % 10;
					firstNumberReversed = firstNumberReversed.next;
					secondNumberReversed = secondNumberReversed.next;

				} else if (firstNumberReversed != null) {
					sumOfOnePlaceValue = firstNumberReversed.num + carry;
					if (sumOfOnePlaceValue > 10) {
						carry = 1;
					}
					tempList.num = sumOfOnePlaceValue % 10;
					firstNumberReversed = firstNumberReversed.next;
				} else if (secondNumberReversed != null) {
					sumOfOnePlaceValue = secondNumberReversed.num + carry;
					if (sumOfOnePlaceValue > 10) {
						carry = 1;
					}
					tempList.num = sumOfOnePlaceValue % 10;
					secondNumberReversed = secondNumberReversed.next;
				} else {
					break;
				}
			}
			if (firstNumberReversed != null || secondNumberReversed != null) {
				tempList.next = new Node();
				tempList = tempList.next;
			}
		}

		if (carry > 0) {
			tempList.next = new Node(carry);
		}
		return Node.reverseLinkedList(resultList);

	}




}

