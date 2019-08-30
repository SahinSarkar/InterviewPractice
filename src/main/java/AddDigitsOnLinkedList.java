public class AddDigitsOnLinkedList {

	public static void main(String[] args) {
		Node n = createListFromDigitsOfNumber("5876");
		Node n1 = createListFromDigitsOfNumber("9874");
		printList(addTwoLinkedListNumbers(n, n1));
	}

	public static Node addTwoLinkedListNumbers(Node firstNumber, Node secondNumber) {
		Node firstNumberReversed = reverseLinkedList(firstNumber);
		Node secondNumberReversed = reverseLinkedList(secondNumber);
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

		if(carry > 0) {
			tempList.next = new Node(carry);
		}
		return reverseLinkedList(resultList);
		
	}

	public static Node createListFromDigitsOfNumber(String num) throws NumberFormatException {
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

	public static void printList(Node list) {
		while (list.next != null) {
			System.out.print(list.num + "->");
			list = list.next;
		}
		System.out.println(list.num);
	}

}

class Node {
	int num;
	Node next;

	public Node(int num) {
		this.num = num;
	}

	public Node() {
		super();
		// TODO Auto-generated constructor stub
	}
}
