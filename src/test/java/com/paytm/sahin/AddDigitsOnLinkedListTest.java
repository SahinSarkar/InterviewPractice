package com.paytm.sahin;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.paytm.sahin.util.Node;

public class AddDigitsOnLinkedListTest {

	@Test
	public void testAddTwoLinkedListNumbersWhenCarryIsAlsoInvolved() {
		Node n1 = Node.createListFromDigitsOfNumber("9878");
		Node n2 = Node.createListFromDigitsOfNumber("5876");
		String printedList = AddDigitsOnLinkedList.addTwoLinkedListNumbers(n1, n2).printList();
		Assert.assertEquals(printedList, "1->5->7->5->4");
	}
	
	@Test
	public void testAddTwoLinkedListNumbersWhenDifferentDigitCount() {
		Node n1 = Node.createListFromDigitsOfNumber("9878");
		Node n2 = Node.createListFromDigitsOfNumber("56");
		String printedList = AddDigitsOnLinkedList.addTwoLinkedListNumbers(n1, n2).printList();
		Assert.assertEquals(printedList, "9->9->3->4");
	}
	
	@Test
	public void testAddTwoLinkedListNumbersWhenOneNumberIsZero() {
		Node n1 = Node.createListFromDigitsOfNumber("9878");
		Node n2 = Node.createListFromDigitsOfNumber("0");
		String printedList = AddDigitsOnLinkedList.addTwoLinkedListNumbers(n1, n2).printList();
		Assert.assertEquals(printedList, "9->8->7->8");
	}

	@Test
	public void testAddTwoLinkedListNumbersWhenOneNumberIsOne() {
		Node n1 = Node.createListFromDigitsOfNumber("9878");
		Node n2 = Node.createListFromDigitsOfNumber("1");
		String printedList = AddDigitsOnLinkedList.addTwoLinkedListNumbers(n1, n2).printList();
		Assert.assertEquals(printedList, "9->8->7->9");
	}

	@Test
	public void testAddTwoLinkedListNumbersWhenOneNumberIsOneAndCarryPropagatesToTheEnd() {
		Node n1 = Node.createListFromDigitsOfNumber("9999");
		Node n2 = Node.createListFromDigitsOfNumber("1");
		String printedList = AddDigitsOnLinkedList.addTwoLinkedListNumbers(n1, n2).printList();
		Assert.assertEquals(printedList, "1->0->0->0->0");
	}
	
}
