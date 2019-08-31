package com.paytm.sahin.util;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.paytm.sahin.util.Node;

public class NodeTest {

	@Test
	public void testPrintList() {
		Node nHead = new Node(2);
		Node n1 = new Node(7);	nHead.next = n1;
		String printedList = nHead.printList();
		Assert.assertEquals(printedList, "2->7");
	}
	
	@Test
	public void testCreateListFromDigitsOfNumber() {
		Node n = Node.createListFromDigitsOfNumber("3563");
		String printedList = n.printList();
		Assert.assertEquals(printedList, "3->5->6->3");
	}

	@Test
	public void testReverseLinkedList() {
		Node n = Node.createListFromDigitsOfNumber("1234");
		Node reversedList = Node.reverseLinkedList(n);
		Assert.assertEquals(reversedList.printList(), "4->3->2->1");
	}
	
	@Test
	public void testReverseLinkedListWhenListIsEmpty() {
		Node n = null;
		Node reversedList = Node.reverseLinkedList(n);
		Assert.assertEquals(reversedList, null);
	}
	
	@Test
	public void testReverseLinkedListWhenListHasSingleElement() {
		Node n = new Node(5);
		Node reversedList = Node.reverseLinkedList(n);
		Assert.assertEquals(reversedList.printList(), "5");
	}
}
